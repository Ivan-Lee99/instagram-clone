package com.instagram_clone.comment_service.grpc

import com.instagram_clone.comment_service.*
import com.instagram_clone.comment_service.CommentsGrpc.CommentsImplBase
import com.instagram_clone.comment_service.data.CommentWrapper
import com.instagram_clone.comment_service.data.Outcome
import com.instagram_clone.comment_service.data.mapFromWrapper
import com.instagram_clone.comment_service.exception.DbException
import com.instagram_clone.comment_service.exception.InvalidParameterException
import com.instagram_clone.comment_service.exception.NotFoundException
import com.instagram_clone.comment_service.service.CommentService
import io.grpc.stub.StreamObserver
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
import io.vertx.core.logging.LoggerFactory
import java.util.stream.Collectors

/**
 * Implementation of the grpc defined comment-service.
 * Delegates logic to a passed [CommentService] instance.
 */
class CommentServiceGrpcImpl(var service: CommentService) : CommentsImplBase() {

  private val logger = LoggerFactory.getLogger("CommentServiceGrpcImpl")

  override fun createComment(request: CreateCommentRequest, responseObserver: StreamObserver<CreateCommentResponse>) {
    val content = request.comment
    val imageId = request.imageId
    val userId = request.userId
    val tags: List<String> = request.tagsList
    val userTags: List<String> = request.userTagsList
    service.createComment(content, userId, imageId, tags, userTags)
      .setHandler { ar: AsyncResult<Outcome<CommentWrapper>> ->
      createCommentHandler(ar, responseObserver)
    }
  }

  override fun getComment(request: GetCommentRequest, responseObserver: StreamObserver<GetCommentResponse>) {
    val id = request.commentId
    service.getComment(id).setHandler { ar: AsyncResult<Outcome<CommentWrapper>> ->
      getCommentHandler(ar, responseObserver)
    }
  }

  override fun deleteComment(request: DeleteCommentRequest, responseObserver: StreamObserver<DeleteCommentResponse>) {
    val id = request.commentId
    service.deleteComment(id).setHandler { ar: AsyncResult<Outcome<String>> ->
     deleteCommentHandler(ar, responseObserver)
    }
  }

  override fun getCommentsByTag(request: GetCommentsByTagRequest, responseObserver: StreamObserver<GetCommentsByTagResponse>) {
    val tag = request.tag
    service.getCommentsByHashTag(tag).setHandler { ar: AsyncResult<Outcome<List<CommentWrapper>>> ->
      getCommentsByTagHandler(ar, responseObserver)
    }
  }

  override fun getCommentsByUserTag(request: GetCommentsByUserTagRequest, responseObserver: StreamObserver<GetCommentsByUserTagResponse>) {
    val tag = request.tag
    service.getCommentsByUserTag(tag).setHandler { ar: AsyncResult<Outcome<List<CommentWrapper>>> ->
      getCommentsByUserTagHandler(ar, responseObserver)
    }
  }

  //**
  //
  // Helper handlers for the async results pulled to own methods
  //
  //**

  private fun createCommentHandler(ar: AsyncResult<Outcome<CommentWrapper>>,
                                   responseObserver: StreamObserver<CreateCommentResponse>) {
    val builder = CreateCommentResponse.newBuilder()
    if (ar.succeeded()) {
      when (val outcome = ar.result()) {
        is Outcome.Success -> {
          val comment = mapFromWrapper(outcome.value)
          builder.comment = comment
        }
        is Outcome.Error -> {
          when (outcome.cause) {
            is DbException -> {
              builder.error = CreateCommentErrorStatus.CREATE_SERVER_ERROR
            }
            is InvalidParameterException -> {
              builder.error = CreateCommentErrorStatus.CREATE_INVALID_PARAMETER
            }
          }
        }
      }
    } else {
      builder.error = CreateCommentErrorStatus.CREATE_SERVER_ERROR
    }
    responseObserver.onNext(builder.build())
    responseObserver.onCompleted()
  }

  private fun getCommentHandler(ar: AsyncResult<Outcome<CommentWrapper>>,
                                responseObserver: StreamObserver<GetCommentResponse>) {
    val builder = GetCommentResponse.newBuilder()
    if (ar.succeeded()) {
      when (val outcome = ar.result()) {
        is Outcome.Success -> {
          val comment = mapFromWrapper(outcome.value)
          builder.comment = comment
        }
        is Outcome.Error -> {
          when (outcome.cause) {
            is NotFoundException -> {
              builder.error = GetCommentErrorStatus.GET_NOT_FOUND
            }
            is DbException -> {
              builder.error = GetCommentErrorStatus.GET_SERVER_ERROR
            }
          }
        }
      }
      } else {
      builder.error = GetCommentErrorStatus.GET_SERVER_ERROR
    }
    responseObserver.onNext(builder.build())
    responseObserver.onCompleted()
  }

  private fun deleteCommentHandler(ar: AsyncResult<Outcome<String>>,
                                   responseObserver: StreamObserver<DeleteCommentResponse>) {
    val builder = DeleteCommentResponse.newBuilder()
    if (ar.succeeded()) {
      when (val outcome = ar.result()) {
        is Outcome.Success -> {
          builder.commentId = outcome.value
        }
        is Outcome.Error -> {
          when (outcome.cause) {
            is DbException -> {
              builder.error = DeleteCommentErrorStatus.DELETE_SERVER_ERROR
            }
          }
        }
      }
    } else {
      builder.error = DeleteCommentErrorStatus.DELETE_SERVER_ERROR
    }
    responseObserver.onNext(builder.build())
    responseObserver.onCompleted()
  }

  private fun getCommentsByTagHandler(ar: AsyncResult<Outcome<List<CommentWrapper>>>,
                                      responseObserver: StreamObserver<GetCommentsByTagResponse>) {
    val builder = GetCommentsByTagResponse.newBuilder()
    if (ar.succeeded()) {
      when (val outcome = ar.result()) {
        is Outcome.Success -> {
          val returnList = outcome.value
          val mapped = returnList.map { comment: CommentWrapper? -> mapFromWrapper(comment!!) }
          builder.comments = CommentList.newBuilder().addAllComments(mapped).build()
        }
        is Outcome.Error -> {
          when (outcome.cause) {
            is DbException -> {
              builder.error = GetCommentsByTagErrorStatus.GET_BY_TAG_SERVER_ERROR
            }
          }
        }
      }
    } else {
      builder.error = GetCommentsByTagErrorStatus.GET_BY_TAG_SERVER_ERROR
    }
    responseObserver.onNext(builder.build())
    responseObserver.onCompleted()
  }

  private fun getCommentsByUserTagHandler(ar: AsyncResult<Outcome<List<CommentWrapper>>>,
                                      responseObserver: StreamObserver<GetCommentsByUserTagResponse>) {
    val builder = GetCommentsByUserTagResponse.newBuilder()
    if (ar.succeeded()) {
      when (val outcome = ar.result()) {
        is Outcome.Success -> {
          val returnList = outcome.value
          val mapped = returnList.map { comment: CommentWrapper? -> mapFromWrapper(comment!!) }
          builder.comments = CommentList.newBuilder().addAllComments(mapped).build()
        }
        is Outcome.Error -> {
          when (outcome.cause) {
            is DbException -> {
              builder.error = GetCommentsByUserTagErrorStatus.GET_BY_USER_TAG_SERVER_ERROR
            }
          }
        }
      }
    } else {
      builder.error = GetCommentsByUserTagErrorStatus.GET_BY_USER_TAG_SERVER_ERROR
    }
    responseObserver.onNext(builder.build())
    responseObserver.onCompleted()
  }
}

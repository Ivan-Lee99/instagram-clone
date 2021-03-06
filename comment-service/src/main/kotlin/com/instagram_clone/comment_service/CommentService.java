// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comment_service.proto

package com.instagram_clone.comment_service;

public final class CommentService {
  private CommentService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_CreateCommentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_CreateCommentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_CreateCommentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_CreateCommentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_GetCommentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_GetCommentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_GetCommentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_GetCommentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_DeleteCommentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_DeleteCommentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_DeleteCommentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_DeleteCommentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_GetCommentsByTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_GetCommentsByTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_GetCommentsByTagResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_GetCommentsByTagResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_CommentList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_CommentList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_GetCommentsByUserTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_GetCommentsByUserTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_GetCommentsByUserTagResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_GetCommentsByUserTagResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Comment_Comment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Comment_Comment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025comment_service.proto\022\007Comment\"k\n\024Crea" +
      "teCommentRequest\022\017\n\007comment\030\001 \001(\t\022\017\n\007use" +
      "r_id\030\002 \001(\t\022\020\n\010image_id\030\003 \001(\t\022\014\n\004tags\030\004 \003" +
      "(\t\022\021\n\tuser_tags\030\005 \003(\t\"z\n\025CreateCommentRe" +
      "sponse\022#\n\007comment\030\001 \001(\0132\020.Comment.Commen" +
      "tH\000\0222\n\005error\030\002 \001(\0162!.Comment.CreateComme" +
      "ntErrorStatusH\000B\010\n\006status\"&\n\021GetCommentR" +
      "equest\022\021\n\tcommentId\030\001 \001(\t\"t\n\022GetCommentR" +
      "esponse\022#\n\007comment\030\001 \001(\0132\020.Comment.Comme" +
      "ntH\000\022/\n\005error\030\002 \001(\0162\036.Comment.GetComment",
      "ErrorStatusH\000B\010\n\006status\")\n\024DeleteComment" +
      "Request\022\021\n\tcommentId\030\001 \001(\t\"j\n\025DeleteComm" +
      "entResponse\022\023\n\tcommentId\030\001 \001(\tH\000\0222\n\005erro" +
      "r\030\002 \001(\0162!.Comment.DeleteCommentErrorStat" +
      "usH\000B\010\n\006status\"&\n\027GetCommentsByTagReques" +
      "t\022\013\n\003tag\030\001 \001(\t\"\205\001\n\030GetCommentsByTagRespo" +
      "nse\022(\n\010comments\030\001 \001(\0132\024.Comment.CommentL" +
      "istH\000\0225\n\005error\030\002 \001(\0162$.Comment.GetCommen" +
      "tsByTagErrorStatusH\000B\010\n\006status\"1\n\013Commen" +
      "tList\022\"\n\010comments\030\001 \003(\0132\020.Comment.Commen",
      "t\"*\n\033GetCommentsByUserTagRequest\022\013\n\003tag\030" +
      "\001 \001(\t\"\215\001\n\034GetCommentsByUserTagResponse\022(" +
      "\n\010comments\030\001 \001(\0132\024.Comment.CommentListH\000" +
      "\0229\n\005error\030\002 \001(\0162(.Comment.GetCommentsByU" +
      "serTagErrorStatusH\000B\010\n\006status\"}\n\007Comment" +
      "\022\n\n\002id\030\001 \001(\t\022\017\n\007content\030\002 \001(\t\022\017\n\007user_id" +
      "\030\003 \001(\t\022\020\n\010image_id\030\004 \001(\t\022\022\n\ncreated_at\030\005" +
      " \001(\t\022\014\n\004tags\030\006 \003(\t\022\020\n\010userTags\030\007 \003(\t*:\n\033" +
      "GetCommentsByTagErrorStatus\022\033\n\027GET_BY_TA" +
      "G_SERVER_ERROR\020\000*C\n\037GetCommentsByUserTag",
      "ErrorStatus\022 \n\034GET_BY_USER_TAG_SERVER_ER" +
      "ROR\020\000*I\n\030DeleteCommentErrorStatus\022\024\n\020DEL" +
      "ETE_NOT_FOUND\020\000\022\027\n\023DELETE_SERVER_ERROR\020\001" +
      "*Q\n\030CreateCommentErrorStatus\022\027\n\023CREATE_S" +
      "ERVER_ERROR\020\000\022\034\n\030CREATE_INVALID_PARAMETE" +
      "R\020\001*@\n\025GetCommentErrorStatus\022\024\n\020GET_SERV" +
      "ER_ERROR\020\000\022\021\n\rGET_NOT_FOUND\020\0012\271\003\n\010Commen" +
      "ts\022P\n\rCreateComment\022\035.Comment.CreateComm" +
      "entRequest\032\036.Comment.CreateCommentRespon" +
      "se\"\000\022G\n\nGetComment\022\032.Comment.GetCommentR",
      "equest\032\033.Comment.GetCommentResponse\"\000\022P\n" +
      "\rDeleteComment\022\035.Comment.DeleteCommentRe" +
      "quest\032\036.Comment.DeleteCommentResponse\"\000\022" +
      "Y\n\020GetCommentsByTag\022 .Comment.GetComment" +
      "sByTagRequest\032!.Comment.GetCommentsByTag" +
      "Response\"\000\022e\n\024GetCommentsByUserTag\022$.Com" +
      "ment.GetCommentsByUserTagRequest\032%.Comme" +
      "nt.GetCommentsByUserTagResponse\"\000B7\n#com" +
      ".instagram_clone.comment_serviceB\016Commen" +
      "tServiceP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Comment_CreateCommentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Comment_CreateCommentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_CreateCommentRequest_descriptor,
        new java.lang.String[] { "Comment", "UserId", "ImageId", "Tags", "UserTags", });
    internal_static_Comment_CreateCommentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Comment_CreateCommentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_CreateCommentResponse_descriptor,
        new java.lang.String[] { "Comment", "Error", "Status", });
    internal_static_Comment_GetCommentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Comment_GetCommentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_GetCommentRequest_descriptor,
        new java.lang.String[] { "CommentId", });
    internal_static_Comment_GetCommentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Comment_GetCommentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_GetCommentResponse_descriptor,
        new java.lang.String[] { "Comment", "Error", "Status", });
    internal_static_Comment_DeleteCommentRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Comment_DeleteCommentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_DeleteCommentRequest_descriptor,
        new java.lang.String[] { "CommentId", });
    internal_static_Comment_DeleteCommentResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Comment_DeleteCommentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_DeleteCommentResponse_descriptor,
        new java.lang.String[] { "CommentId", "Error", "Status", });
    internal_static_Comment_GetCommentsByTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Comment_GetCommentsByTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_GetCommentsByTagRequest_descriptor,
        new java.lang.String[] { "Tag", });
    internal_static_Comment_GetCommentsByTagResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Comment_GetCommentsByTagResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_GetCommentsByTagResponse_descriptor,
        new java.lang.String[] { "Comments", "Error", "Status", });
    internal_static_Comment_CommentList_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Comment_CommentList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_CommentList_descriptor,
        new java.lang.String[] { "Comments", });
    internal_static_Comment_GetCommentsByUserTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Comment_GetCommentsByUserTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_GetCommentsByUserTagRequest_descriptor,
        new java.lang.String[] { "Tag", });
    internal_static_Comment_GetCommentsByUserTagResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Comment_GetCommentsByUserTagResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_GetCommentsByUserTagResponse_descriptor,
        new java.lang.String[] { "Comments", "Error", "Status", });
    internal_static_Comment_Comment_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_Comment_Comment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Comment_Comment_descriptor,
        new java.lang.String[] { "Id", "Content", "UserId", "ImageId", "CreatedAt", "Tags", "UserTags", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

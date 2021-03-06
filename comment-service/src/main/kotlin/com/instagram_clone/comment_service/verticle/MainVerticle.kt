package com.instagram_clone.comment_service.verticle

import com.instagram_clone.comment_service.CommentsGrpc
import com.instagram_clone.comment_service.data.Constants
import com.instagram_clone.comment_service.grpc.CommentServiceGrpcImpl
import com.instagram_clone.comment_service.service.CommentServiceMockImpl
import com.instagram_clone.comment_service.service.CommentServiceMongoImpl
import com.instagram_clone.comment_service.util.retrieveProblematicString
import io.vertx.config.ConfigRetriever
import io.vertx.core.AbstractVerticle
import io.vertx.core.Context
import io.vertx.core.Promise
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.logging.Logger
import io.vertx.core.logging.LoggerFactory
import io.vertx.ext.consul.ConsulClient
import io.vertx.ext.consul.ConsulClientOptions
import io.vertx.ext.consul.ServiceOptions
import io.vertx.ext.mongo.MongoClient
import io.vertx.grpc.VertxServerBuilder
import java.lang.ClassCastException
import java.util.*


private const val SERVICE_NAME = "comments-service"

class MainVerticle : AbstractVerticle() {

  private lateinit var logger: Logger
  private lateinit var mongoClient: MongoClient
  private lateinit var config: JsonObject

  override fun init(vertx: Vertx, context: Context) {
    super.init(vertx, context)
    logger = LoggerFactory.getLogger("MainVerticle")
  }

  override fun start(startPromise: Promise<Void>) {
    val configRetriever = ConfigRetriever.create(vertx)
    configRetriever.getConfig {
      if (it.succeeded()) {
        config = it.result()
        mongoClient = configureMongo(config)
        val commentService = CommentServiceMongoImpl(mongoClient)
        val service: CommentsGrpc.CommentsImplBase = CommentServiceGrpcImpl(commentService)
        val grpcPort = retrieveProblematicString(config, Constants.GRPC_KEY_PORT).toInt()
        val rpcServer = VertxServerBuilder
          .forAddress(vertx, config.getString(Constants.GRPC_KEY_HOST), grpcPort.toInt())
          .addService(service)
          .build()
        rpcServer.start()
        logger.info("Grpc server started")
        configureConsul(config)
      } else {
        logger.error("Failed to retrieve configurations")
      }
    }

    startPromise.complete()
  }

  private fun configureConsul(config: JsonObject) {
    val options = ConsulClientOptions()
    options.host = config.getString(Constants.CONSUL_KEY_HOST)
    options.port = retrieveProblematicString(config, Constants.CONSUL_KEY_PORT).toInt()
    val consulClient = ConsulClient.create(vertx, options)
    registerService(config, consulClient)
  }

  private fun registerService(config: JsonObject, client: ConsulClient) {
    val options = ServiceOptions()
    options.name = SERVICE_NAME
    options.id = UUID.randomUUID().toString()
    options.port = retrieveProblematicString(config, Constants.GRPC_KEY_PORT).toInt()

    client.registerService(options) {
      if (it.succeeded()) {
        logger.info("Registered service to consul with name: $SERVICE_NAME")
      } else {
        logger.error("Failed to register service to consul, cause:", it.cause())
      }
    }
  }

  private fun configureMongo(config: JsonObject) : MongoClient {
    val mongoUser = config.getString(Constants.MONGO_KEY_USER)
    val mongoPwd = config.getString(Constants.MONGO_KEY_PASSWORD)
    val mongoDb = config.getString(Constants.MONGO_KEY_DB_NAME)
    val mongoPort = try {
      config.getString(Constants.MONGO_KEY_PORT)
    } catch (e: ClassCastException) {
      config.getDouble(Constants.MONGO_KEY_PORT).toString().substringBeforeLast(".")
    }
    val mongoHost = config.getString(Constants.MONGO_KEY_HOST)
    val connString = "mongodb://$mongoUser:$mongoPwd@$mongoHost:$mongoPort/$mongoDb"
    logger.info("Mongo conf:\ndb: $mongoDb\nuser: $mongoUser\nport: $mongoPort\nhost: $mongoHost")
    val mongoConfig = JsonObject()
    mongoConfig.put("db_name", mongoDb)
    mongoConfig.put("connection_string", connString)
    return MongoClient.createShared(vertx, mongoConfig)
  }
}

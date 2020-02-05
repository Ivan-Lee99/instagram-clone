package com.instagram_clone.image_service.data

import com.instagram_clone.image_service.Image
import com.instagram_clone.image_service.exception.CaptionTooLongException
import com.instagram_clone.image_service.exception.InvalidDataException
import com.instagram_clone.image_service.util.TagParser
import java.awt.image.BufferedImage
import java.util.*

const val MAX_CAPTION_LENGTH = 500

/**
 * Map given image properties into an instance of [ImageMeta]
 */
@Throws(InvalidDataException::class, CaptionTooLongException::class)
fun mapImageMeta(caption: String, userId: String, buf: BufferedImage): ImageMeta {
  if (caption.length > MAX_CAPTION_LENGTH) {
    throw CaptionTooLongException(
      "Caption cannot be longer than $MAX_CAPTION_LENGTH but received ${caption.length}"
    )
  }

  val width = buf.width
  val height = buf.height

  val type = when (buf.type) {
    BufferedImage.TYPE_INT_RGB -> "img/jpg"
    BufferedImage.TYPE_INT_ARGB -> "img/png"
    BufferedImage.TYPE_4BYTE_ABGR -> "img/png"
    else -> throw InvalidDataException("Given image type ${buf.type} is not supported")
  }
  return mapImageMeta(
    caption,
    userId,
    width,
    height,
    type
  )
}

/**
 * Map given image properties into an instance of [ImageMeta]
 */
fun mapImageMeta(
  caption: String,
  userId: String,
  width: Int,
  height: Int,
  type: String
): ImageMeta = ImageMeta(
  UUID.randomUUID().toString(),
  type,
  width,
  height,
  userId,
  caption,
  hashTags = TagParser.parseHashTags(caption),
  userTags = TagParser.parseUserTags(caption)
)

/**
 * Build a gRPC [Image] message from [ImageMeta]
 */
fun fromImageMeta(meta: ImageMeta): Image = Image.newBuilder()
  .setId(meta.id)
  .setMimeType(meta.mimeType)
  .setWidth(meta.width)
  .setHeight(meta.height)
  .setUserId(meta.userId)
  .setCaption(meta.caption)
  .setCreatedAt(meta.createdAt)
  .addAllUserTags(meta.userTags)
  .addAllHashTags(meta.hashTags)
  .build()


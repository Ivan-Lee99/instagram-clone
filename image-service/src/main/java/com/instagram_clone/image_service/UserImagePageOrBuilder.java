// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

public interface UserImagePageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Image.UserImagePage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the user
   * </pre>
   *
   * <code>string user_id = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * ID of the user
   * </pre>
   *
   * <code>string user_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Page size (e.g. 20); guaranteed maximum of retrieved images
   * </pre>
   *
   * <code>int32 size = 2;</code>
   */
  int getSize();

  /**
   * <pre>
   * Page number (e.g. 2)
   * </pre>
   *
   * <code>int32 page = 3;</code>
   */
  int getPage();

  /**
   * <pre>
   * Total count of images for the user (e.g. 284)
   * </pre>
   *
   * <code>int32 total_count = 4;</code>
   */
  int getTotalCount();

  /**
   * <pre>
   * Array of images; less or equal to "size"
   * </pre>
   *
   * <code>repeated .Image.Image images = 5;</code>
   */
  java.util.List<com.instagram_clone.image_service.Image> 
      getImagesList();
  /**
   * <pre>
   * Array of images; less or equal to "size"
   * </pre>
   *
   * <code>repeated .Image.Image images = 5;</code>
   */
  com.instagram_clone.image_service.Image getImages(int index);
  /**
   * <pre>
   * Array of images; less or equal to "size"
   * </pre>
   *
   * <code>repeated .Image.Image images = 5;</code>
   */
  int getImagesCount();
  /**
   * <pre>
   * Array of images; less or equal to "size"
   * </pre>
   *
   * <code>repeated .Image.Image images = 5;</code>
   */
  java.util.List<? extends com.instagram_clone.image_service.ImageOrBuilder> 
      getImagesOrBuilderList();
  /**
   * <pre>
   * Array of images; less or equal to "size"
   * </pre>
   *
   * <code>repeated .Image.Image images = 5;</code>
   */
  com.instagram_clone.image_service.ImageOrBuilder getImagesOrBuilder(
      int index);
}

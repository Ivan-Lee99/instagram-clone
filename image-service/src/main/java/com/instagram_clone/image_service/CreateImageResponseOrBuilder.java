// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

public interface CreateImageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Image.CreateImageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Image.Image image = 1;</code>
   */
  com.instagram_clone.image_service.Image getImage();
  /**
   * <code>.Image.Image image = 1;</code>
   */
  com.instagram_clone.image_service.ImageOrBuilder getImageOrBuilder();

  /**
   * <code>.Image.CreateImageErrorStatus error = 2;</code>
   */
  int getErrorValue();
  /**
   * <code>.Image.CreateImageErrorStatus error = 2;</code>
   */
  com.instagram_clone.image_service.CreateImageErrorStatus getError();

  public com.instagram_clone.image_service.CreateImageResponse.StatusCase getStatusCase();
}

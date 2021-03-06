// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

/**
 * Protobuf type {@code Image.GetImageResponse}
 */
public  final class GetImageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Image.GetImageResponse)
    GetImageResponseOrBuilder {
  // Use GetImageResponse.newBuilder() to construct.
  private GetImageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetImageResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetImageResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.instagram_clone.image_service.Image.Builder subBuilder = null;
            if (statusCase_ == 1) {
              subBuilder = ((com.instagram_clone.image_service.Image) status_).toBuilder();
            }
            status_ =
                input.readMessage(com.instagram_clone.image_service.Image.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.instagram_clone.image_service.Image) status_);
              status_ = subBuilder.buildPartial();
            }
            statusCase_ = 1;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            statusCase_ = 2;
            status_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.instagram_clone.image_service.ImageService.internal_static_Image_GetImageResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.instagram_clone.image_service.ImageService.internal_static_Image_GetImageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.instagram_clone.image_service.GetImageResponse.class, com.instagram_clone.image_service.GetImageResponse.Builder.class);
  }

  private int statusCase_ = 0;
  private java.lang.Object status_;
  public enum StatusCase
      implements com.google.protobuf.Internal.EnumLite {
    IMAGE(1),
    ERROR(2),
    STATUS_NOT_SET(0);
    private final int value;
    private StatusCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StatusCase valueOf(int value) {
      return forNumber(value);
    }

    public static StatusCase forNumber(int value) {
      switch (value) {
        case 1: return IMAGE;
        case 2: return ERROR;
        case 0: return STATUS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StatusCase
  getStatusCase() {
    return StatusCase.forNumber(
        statusCase_);
  }

  public static final int IMAGE_FIELD_NUMBER = 1;
  /**
   * <code>.Image.Image image = 1;</code>
   */
  public com.instagram_clone.image_service.Image getImage() {
    if (statusCase_ == 1) {
       return (com.instagram_clone.image_service.Image) status_;
    }
    return com.instagram_clone.image_service.Image.getDefaultInstance();
  }
  /**
   * <code>.Image.Image image = 1;</code>
   */
  public com.instagram_clone.image_service.ImageOrBuilder getImageOrBuilder() {
    if (statusCase_ == 1) {
       return (com.instagram_clone.image_service.Image) status_;
    }
    return com.instagram_clone.image_service.Image.getDefaultInstance();
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  /**
   * <code>.Image.GetImageErrorStatus error = 2;</code>
   */
  public int getErrorValue() {
    if (statusCase_ == 2) {
      return (java.lang.Integer) status_;
    }
    return 0;
  }
  /**
   * <code>.Image.GetImageErrorStatus error = 2;</code>
   */
  public com.instagram_clone.image_service.GetImageErrorStatus getError() {
    if (statusCase_ == 2) {
      com.instagram_clone.image_service.GetImageErrorStatus result = com.instagram_clone.image_service.GetImageErrorStatus.valueOf(
          (java.lang.Integer) status_);
      return result == null ? com.instagram_clone.image_service.GetImageErrorStatus.UNRECOGNIZED : result;
    }
    return com.instagram_clone.image_service.GetImageErrorStatus.GET_IMAGE_SERVER_ERROR;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (statusCase_ == 1) {
      output.writeMessage(1, (com.instagram_clone.image_service.Image) status_);
    }
    if (statusCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) status_));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (statusCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.instagram_clone.image_service.Image) status_);
    }
    if (statusCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ((java.lang.Integer) status_));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.instagram_clone.image_service.GetImageResponse)) {
      return super.equals(obj);
    }
    com.instagram_clone.image_service.GetImageResponse other = (com.instagram_clone.image_service.GetImageResponse) obj;

    boolean result = true;
    result = result && getStatusCase().equals(
        other.getStatusCase());
    if (!result) return false;
    switch (statusCase_) {
      case 1:
        result = result && getImage()
            .equals(other.getImage());
        break;
      case 2:
        result = result && getErrorValue()
            == other.getErrorValue();
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (statusCase_) {
      case 1:
        hash = (37 * hash) + IMAGE_FIELD_NUMBER;
        hash = (53 * hash) + getImage().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getErrorValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.instagram_clone.image_service.GetImageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.GetImageResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.instagram_clone.image_service.GetImageResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Image.GetImageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Image.GetImageResponse)
      com.instagram_clone.image_service.GetImageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_GetImageResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_GetImageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.instagram_clone.image_service.GetImageResponse.class, com.instagram_clone.image_service.GetImageResponse.Builder.class);
    }

    // Construct using com.instagram_clone.image_service.GetImageResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      statusCase_ = 0;
      status_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_GetImageResponse_descriptor;
    }

    public com.instagram_clone.image_service.GetImageResponse getDefaultInstanceForType() {
      return com.instagram_clone.image_service.GetImageResponse.getDefaultInstance();
    }

    public com.instagram_clone.image_service.GetImageResponse build() {
      com.instagram_clone.image_service.GetImageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.instagram_clone.image_service.GetImageResponse buildPartial() {
      com.instagram_clone.image_service.GetImageResponse result = new com.instagram_clone.image_service.GetImageResponse(this);
      if (statusCase_ == 1) {
        if (imageBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = imageBuilder_.build();
        }
      }
      if (statusCase_ == 2) {
        result.status_ = status_;
      }
      result.statusCase_ = statusCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.instagram_clone.image_service.GetImageResponse) {
        return mergeFrom((com.instagram_clone.image_service.GetImageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.instagram_clone.image_service.GetImageResponse other) {
      if (other == com.instagram_clone.image_service.GetImageResponse.getDefaultInstance()) return this;
      switch (other.getStatusCase()) {
        case IMAGE: {
          mergeImage(other.getImage());
          break;
        }
        case ERROR: {
          setErrorValue(other.getErrorValue());
          break;
        }
        case STATUS_NOT_SET: {
          break;
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.instagram_clone.image_service.GetImageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.instagram_clone.image_service.GetImageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int statusCase_ = 0;
    private java.lang.Object status_;
    public StatusCase
        getStatusCase() {
      return StatusCase.forNumber(
          statusCase_);
    }

    public Builder clearStatus() {
      statusCase_ = 0;
      status_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.instagram_clone.image_service.Image, com.instagram_clone.image_service.Image.Builder, com.instagram_clone.image_service.ImageOrBuilder> imageBuilder_;
    /**
     * <code>.Image.Image image = 1;</code>
     */
    public com.instagram_clone.image_service.Image getImage() {
      if (imageBuilder_ == null) {
        if (statusCase_ == 1) {
          return (com.instagram_clone.image_service.Image) status_;
        }
        return com.instagram_clone.image_service.Image.getDefaultInstance();
      } else {
        if (statusCase_ == 1) {
          return imageBuilder_.getMessage();
        }
        return com.instagram_clone.image_service.Image.getDefaultInstance();
      }
    }
    /**
     * <code>.Image.Image image = 1;</code>
     */
    public Builder setImage(com.instagram_clone.image_service.Image value) {
      if (imageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        imageBuilder_.setMessage(value);
      }
      statusCase_ = 1;
      return this;
    }
    /**
     * <code>.Image.Image image = 1;</code>
     */
    public Builder setImage(
        com.instagram_clone.image_service.Image.Builder builderForValue) {
      if (imageBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        imageBuilder_.setMessage(builderForValue.build());
      }
      statusCase_ = 1;
      return this;
    }
    /**
     * <code>.Image.Image image = 1;</code>
     */
    public Builder mergeImage(com.instagram_clone.image_service.Image value) {
      if (imageBuilder_ == null) {
        if (statusCase_ == 1 &&
            status_ != com.instagram_clone.image_service.Image.getDefaultInstance()) {
          status_ = com.instagram_clone.image_service.Image.newBuilder((com.instagram_clone.image_service.Image) status_)
              .mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        if (statusCase_ == 1) {
          imageBuilder_.mergeFrom(value);
        }
        imageBuilder_.setMessage(value);
      }
      statusCase_ = 1;
      return this;
    }
    /**
     * <code>.Image.Image image = 1;</code>
     */
    public Builder clearImage() {
      if (imageBuilder_ == null) {
        if (statusCase_ == 1) {
          statusCase_ = 0;
          status_ = null;
          onChanged();
        }
      } else {
        if (statusCase_ == 1) {
          statusCase_ = 0;
          status_ = null;
        }
        imageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.Image.Image image = 1;</code>
     */
    public com.instagram_clone.image_service.Image.Builder getImageBuilder() {
      return getImageFieldBuilder().getBuilder();
    }
    /**
     * <code>.Image.Image image = 1;</code>
     */
    public com.instagram_clone.image_service.ImageOrBuilder getImageOrBuilder() {
      if ((statusCase_ == 1) && (imageBuilder_ != null)) {
        return imageBuilder_.getMessageOrBuilder();
      } else {
        if (statusCase_ == 1) {
          return (com.instagram_clone.image_service.Image) status_;
        }
        return com.instagram_clone.image_service.Image.getDefaultInstance();
      }
    }
    /**
     * <code>.Image.Image image = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.instagram_clone.image_service.Image, com.instagram_clone.image_service.Image.Builder, com.instagram_clone.image_service.ImageOrBuilder> 
        getImageFieldBuilder() {
      if (imageBuilder_ == null) {
        if (!(statusCase_ == 1)) {
          status_ = com.instagram_clone.image_service.Image.getDefaultInstance();
        }
        imageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.instagram_clone.image_service.Image, com.instagram_clone.image_service.Image.Builder, com.instagram_clone.image_service.ImageOrBuilder>(
                (com.instagram_clone.image_service.Image) status_,
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      statusCase_ = 1;
      onChanged();;
      return imageBuilder_;
    }

    /**
     * <code>.Image.GetImageErrorStatus error = 2;</code>
     */
    public int getErrorValue() {
      if (statusCase_ == 2) {
        return ((java.lang.Integer) status_).intValue();
      }
      return 0;
    }
    /**
     * <code>.Image.GetImageErrorStatus error = 2;</code>
     */
    public Builder setErrorValue(int value) {
      statusCase_ = 2;
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Image.GetImageErrorStatus error = 2;</code>
     */
    public com.instagram_clone.image_service.GetImageErrorStatus getError() {
      if (statusCase_ == 2) {
        com.instagram_clone.image_service.GetImageErrorStatus result = com.instagram_clone.image_service.GetImageErrorStatus.valueOf(
            (java.lang.Integer) status_);
        return result == null ? com.instagram_clone.image_service.GetImageErrorStatus.UNRECOGNIZED : result;
      }
      return com.instagram_clone.image_service.GetImageErrorStatus.GET_IMAGE_SERVER_ERROR;
    }
    /**
     * <code>.Image.GetImageErrorStatus error = 2;</code>
     */
    public Builder setError(com.instagram_clone.image_service.GetImageErrorStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      statusCase_ = 2;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Image.GetImageErrorStatus error = 2;</code>
     */
    public Builder clearError() {
      if (statusCase_ == 2) {
        statusCase_ = 0;
        status_ = null;
        onChanged();
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Image.GetImageResponse)
  }

  // @@protoc_insertion_point(class_scope:Image.GetImageResponse)
  private static final com.instagram_clone.image_service.GetImageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.instagram_clone.image_service.GetImageResponse();
  }

  public static com.instagram_clone.image_service.GetImageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetImageResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetImageResponse>() {
    public GetImageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetImageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetImageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetImageResponse> getParserForType() {
    return PARSER;
  }

  public com.instagram_clone.image_service.GetImageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


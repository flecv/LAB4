// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: director.proto

package com.example.grpc.server.grpcserver.director;

/**
 * Protobuf type {@code com.example.grpc.server.grpcserver.director.GetResponse}
 */
public  final class GetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.server.grpcserver.director.GetResponse)
    GetResponseOrBuilder {
  // Use GetResponse.newBuilder() to construct.
  private GetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetResponse() {
    director_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              director_ = new java.util.ArrayList<com.example.grpc.server.grpcserver.director.ProtoDirector>();
              mutable_bitField0_ |= 0x00000001;
            }
            director_.add(
                input.readMessage(com.example.grpc.server.grpcserver.director.ProtoDirector.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        director_ = java.util.Collections.unmodifiableList(director_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.server.grpcserver.director.Director.internal_static_com_example_grpc_server_grpcserver_director_GetResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.director.Director.internal_static_com_example_grpc_server_grpcserver_director_GetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.director.GetResponse.class, com.example.grpc.server.grpcserver.director.GetResponse.Builder.class);
  }

  public static final int DIRECTOR_FIELD_NUMBER = 1;
  private java.util.List<com.example.grpc.server.grpcserver.director.ProtoDirector> director_;
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  public java.util.List<com.example.grpc.server.grpcserver.director.ProtoDirector> getDirectorList() {
    return director_;
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  public java.util.List<? extends com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder> 
      getDirectorOrBuilderList() {
    return director_;
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  public int getDirectorCount() {
    return director_.size();
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  public com.example.grpc.server.grpcserver.director.ProtoDirector getDirector(int index) {
    return director_.get(index);
  }
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  public com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder getDirectorOrBuilder(
      int index) {
    return director_.get(index);
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
    for (int i = 0; i < director_.size(); i++) {
      output.writeMessage(1, director_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < director_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, director_.get(i));
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
    if (!(obj instanceof com.example.grpc.server.grpcserver.director.GetResponse)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.director.GetResponse other = (com.example.grpc.server.grpcserver.director.GetResponse) obj;

    boolean result = true;
    result = result && getDirectorList()
        .equals(other.getDirectorList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDirectorCount() > 0) {
      hash = (37 * hash) + DIRECTOR_FIELD_NUMBER;
      hash = (53 * hash) + getDirectorList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.director.GetResponse parseFrom(
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
  public static Builder newBuilder(com.example.grpc.server.grpcserver.director.GetResponse prototype) {
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
   * Protobuf type {@code com.example.grpc.server.grpcserver.director.GetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.server.grpcserver.director.GetResponse)
      com.example.grpc.server.grpcserver.director.GetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.director.Director.internal_static_com_example_grpc_server_grpcserver_director_GetResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.director.Director.internal_static_com_example_grpc_server_grpcserver_director_GetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.director.GetResponse.class, com.example.grpc.server.grpcserver.director.GetResponse.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.director.GetResponse.newBuilder()
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
        getDirectorFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (directorBuilder_ == null) {
        director_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        directorBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.director.Director.internal_static_com_example_grpc_server_grpcserver_director_GetResponse_descriptor;
    }

    public com.example.grpc.server.grpcserver.director.GetResponse getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.director.GetResponse.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.director.GetResponse build() {
      com.example.grpc.server.grpcserver.director.GetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.director.GetResponse buildPartial() {
      com.example.grpc.server.grpcserver.director.GetResponse result = new com.example.grpc.server.grpcserver.director.GetResponse(this);
      int from_bitField0_ = bitField0_;
      if (directorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          director_ = java.util.Collections.unmodifiableList(director_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.director_ = director_;
      } else {
        result.director_ = directorBuilder_.build();
      }
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
      if (other instanceof com.example.grpc.server.grpcserver.director.GetResponse) {
        return mergeFrom((com.example.grpc.server.grpcserver.director.GetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.director.GetResponse other) {
      if (other == com.example.grpc.server.grpcserver.director.GetResponse.getDefaultInstance()) return this;
      if (directorBuilder_ == null) {
        if (!other.director_.isEmpty()) {
          if (director_.isEmpty()) {
            director_ = other.director_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDirectorIsMutable();
            director_.addAll(other.director_);
          }
          onChanged();
        }
      } else {
        if (!other.director_.isEmpty()) {
          if (directorBuilder_.isEmpty()) {
            directorBuilder_.dispose();
            directorBuilder_ = null;
            director_ = other.director_;
            bitField0_ = (bitField0_ & ~0x00000001);
            directorBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDirectorFieldBuilder() : null;
          } else {
            directorBuilder_.addAllMessages(other.director_);
          }
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
      com.example.grpc.server.grpcserver.director.GetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.director.GetResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.grpc.server.grpcserver.director.ProtoDirector> director_ =
      java.util.Collections.emptyList();
    private void ensureDirectorIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        director_ = new java.util.ArrayList<com.example.grpc.server.grpcserver.director.ProtoDirector>(director_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.server.grpcserver.director.ProtoDirector, com.example.grpc.server.grpcserver.director.ProtoDirector.Builder, com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder> directorBuilder_;

    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public java.util.List<com.example.grpc.server.grpcserver.director.ProtoDirector> getDirectorList() {
      if (directorBuilder_ == null) {
        return java.util.Collections.unmodifiableList(director_);
      } else {
        return directorBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public int getDirectorCount() {
      if (directorBuilder_ == null) {
        return director_.size();
      } else {
        return directorBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public com.example.grpc.server.grpcserver.director.ProtoDirector getDirector(int index) {
      if (directorBuilder_ == null) {
        return director_.get(index);
      } else {
        return directorBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder setDirector(
        int index, com.example.grpc.server.grpcserver.director.ProtoDirector value) {
      if (directorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectorIsMutable();
        director_.set(index, value);
        onChanged();
      } else {
        directorBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder setDirector(
        int index, com.example.grpc.server.grpcserver.director.ProtoDirector.Builder builderForValue) {
      if (directorBuilder_ == null) {
        ensureDirectorIsMutable();
        director_.set(index, builderForValue.build());
        onChanged();
      } else {
        directorBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder addDirector(com.example.grpc.server.grpcserver.director.ProtoDirector value) {
      if (directorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectorIsMutable();
        director_.add(value);
        onChanged();
      } else {
        directorBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder addDirector(
        int index, com.example.grpc.server.grpcserver.director.ProtoDirector value) {
      if (directorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectorIsMutable();
        director_.add(index, value);
        onChanged();
      } else {
        directorBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder addDirector(
        com.example.grpc.server.grpcserver.director.ProtoDirector.Builder builderForValue) {
      if (directorBuilder_ == null) {
        ensureDirectorIsMutable();
        director_.add(builderForValue.build());
        onChanged();
      } else {
        directorBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder addDirector(
        int index, com.example.grpc.server.grpcserver.director.ProtoDirector.Builder builderForValue) {
      if (directorBuilder_ == null) {
        ensureDirectorIsMutable();
        director_.add(index, builderForValue.build());
        onChanged();
      } else {
        directorBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder addAllDirector(
        java.lang.Iterable<? extends com.example.grpc.server.grpcserver.director.ProtoDirector> values) {
      if (directorBuilder_ == null) {
        ensureDirectorIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, director_);
        onChanged();
      } else {
        directorBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder clearDirector() {
      if (directorBuilder_ == null) {
        director_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        directorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public Builder removeDirector(int index) {
      if (directorBuilder_ == null) {
        ensureDirectorIsMutable();
        director_.remove(index);
        onChanged();
      } else {
        directorBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public com.example.grpc.server.grpcserver.director.ProtoDirector.Builder getDirectorBuilder(
        int index) {
      return getDirectorFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder getDirectorOrBuilder(
        int index) {
      if (directorBuilder_ == null) {
        return director_.get(index);  } else {
        return directorBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public java.util.List<? extends com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder> 
         getDirectorOrBuilderList() {
      if (directorBuilder_ != null) {
        return directorBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(director_);
      }
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public com.example.grpc.server.grpcserver.director.ProtoDirector.Builder addDirectorBuilder() {
      return getDirectorFieldBuilder().addBuilder(
          com.example.grpc.server.grpcserver.director.ProtoDirector.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public com.example.grpc.server.grpcserver.director.ProtoDirector.Builder addDirectorBuilder(
        int index) {
      return getDirectorFieldBuilder().addBuilder(
          index, com.example.grpc.server.grpcserver.director.ProtoDirector.getDefaultInstance());
    }
    /**
     * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
     */
    public java.util.List<com.example.grpc.server.grpcserver.director.ProtoDirector.Builder> 
         getDirectorBuilderList() {
      return getDirectorFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.grpc.server.grpcserver.director.ProtoDirector, com.example.grpc.server.grpcserver.director.ProtoDirector.Builder, com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder> 
        getDirectorFieldBuilder() {
      if (directorBuilder_ == null) {
        directorBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.grpc.server.grpcserver.director.ProtoDirector, com.example.grpc.server.grpcserver.director.ProtoDirector.Builder, com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder>(
                director_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        director_ = null;
      }
      return directorBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.server.grpcserver.director.GetResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.server.grpcserver.director.GetResponse)
  private static final com.example.grpc.server.grpcserver.director.GetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.director.GetResponse();
  }

  public static com.example.grpc.server.grpcserver.director.GetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetResponse>() {
    public GetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetResponse> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.server.grpcserver.director.GetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

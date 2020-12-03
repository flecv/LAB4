// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.example.grpc.server.grpcserver.order;

/**
 * Protobuf type {@code com.example.grpc.server.grpcserver.order.CreateRequest}
 */
public  final class CreateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.server.grpcserver.order.CreateRequest)
    CreateRequestOrBuilder {
  // Use CreateRequest.newBuilder() to construct.
  private CreateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateRequest(
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
            com.example.grpc.server.grpcserver.order.ProtoOrder.Builder subBuilder = null;
            if (order_ != null) {
              subBuilder = order_.toBuilder();
            }
            order_ = input.readMessage(com.example.grpc.server.grpcserver.order.ProtoOrder.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(order_);
              order_ = subBuilder.buildPartial();
            }

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
    return com.example.grpc.server.grpcserver.order.Order.internal_static_com_example_grpc_server_grpcserver_order_CreateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.order.Order.internal_static_com_example_grpc_server_grpcserver_order_CreateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.order.CreateRequest.class, com.example.grpc.server.grpcserver.order.CreateRequest.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  private com.example.grpc.server.grpcserver.order.ProtoOrder order_;
  /**
   * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
   */
  public boolean hasOrder() {
    return order_ != null;
  }
  /**
   * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
   */
  public com.example.grpc.server.grpcserver.order.ProtoOrder getOrder() {
    return order_ == null ? com.example.grpc.server.grpcserver.order.ProtoOrder.getDefaultInstance() : order_;
  }
  /**
   * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
   */
  public com.example.grpc.server.grpcserver.order.ProtoOrderOrBuilder getOrderOrBuilder() {
    return getOrder();
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
    if (order_ != null) {
      output.writeMessage(1, getOrder());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (order_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrder());
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
    if (!(obj instanceof com.example.grpc.server.grpcserver.order.CreateRequest)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.order.CreateRequest other = (com.example.grpc.server.grpcserver.order.CreateRequest) obj;

    boolean result = true;
    result = result && (hasOrder() == other.hasOrder());
    if (hasOrder()) {
      result = result && getOrder()
          .equals(other.getOrder());
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
    if (hasOrder()) {
      hash = (37 * hash) + ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getOrder().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.order.CreateRequest parseFrom(
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
  public static Builder newBuilder(com.example.grpc.server.grpcserver.order.CreateRequest prototype) {
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
   * Protobuf type {@code com.example.grpc.server.grpcserver.order.CreateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.server.grpcserver.order.CreateRequest)
      com.example.grpc.server.grpcserver.order.CreateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.order.Order.internal_static_com_example_grpc_server_grpcserver_order_CreateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.order.Order.internal_static_com_example_grpc_server_grpcserver_order_CreateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.order.CreateRequest.class, com.example.grpc.server.grpcserver.order.CreateRequest.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.order.CreateRequest.newBuilder()
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
      if (orderBuilder_ == null) {
        order_ = null;
      } else {
        order_ = null;
        orderBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.order.Order.internal_static_com_example_grpc_server_grpcserver_order_CreateRequest_descriptor;
    }

    public com.example.grpc.server.grpcserver.order.CreateRequest getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.order.CreateRequest.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.order.CreateRequest build() {
      com.example.grpc.server.grpcserver.order.CreateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.order.CreateRequest buildPartial() {
      com.example.grpc.server.grpcserver.order.CreateRequest result = new com.example.grpc.server.grpcserver.order.CreateRequest(this);
      if (orderBuilder_ == null) {
        result.order_ = order_;
      } else {
        result.order_ = orderBuilder_.build();
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
      if (other instanceof com.example.grpc.server.grpcserver.order.CreateRequest) {
        return mergeFrom((com.example.grpc.server.grpcserver.order.CreateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.order.CreateRequest other) {
      if (other == com.example.grpc.server.grpcserver.order.CreateRequest.getDefaultInstance()) return this;
      if (other.hasOrder()) {
        mergeOrder(other.getOrder());
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
      com.example.grpc.server.grpcserver.order.CreateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.order.CreateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.grpc.server.grpcserver.order.ProtoOrder order_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.server.grpcserver.order.ProtoOrder, com.example.grpc.server.grpcserver.order.ProtoOrder.Builder, com.example.grpc.server.grpcserver.order.ProtoOrderOrBuilder> orderBuilder_;
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    public boolean hasOrder() {
      return orderBuilder_ != null || order_ != null;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    public com.example.grpc.server.grpcserver.order.ProtoOrder getOrder() {
      if (orderBuilder_ == null) {
        return order_ == null ? com.example.grpc.server.grpcserver.order.ProtoOrder.getDefaultInstance() : order_;
      } else {
        return orderBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    public Builder setOrder(com.example.grpc.server.grpcserver.order.ProtoOrder value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        order_ = value;
        onChanged();
      } else {
        orderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    public Builder setOrder(
        com.example.grpc.server.grpcserver.order.ProtoOrder.Builder builderForValue) {
      if (orderBuilder_ == null) {
        order_ = builderForValue.build();
        onChanged();
      } else {
        orderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    public Builder mergeOrder(com.example.grpc.server.grpcserver.order.ProtoOrder value) {
      if (orderBuilder_ == null) {
        if (order_ != null) {
          order_ =
            com.example.grpc.server.grpcserver.order.ProtoOrder.newBuilder(order_).mergeFrom(value).buildPartial();
        } else {
          order_ = value;
        }
        onChanged();
      } else {
        orderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    public Builder clearOrder() {
      if (orderBuilder_ == null) {
        order_ = null;
        onChanged();
      } else {
        order_ = null;
        orderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    public com.example.grpc.server.grpcserver.order.ProtoOrder.Builder getOrderBuilder() {
      
      onChanged();
      return getOrderFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    public com.example.grpc.server.grpcserver.order.ProtoOrderOrBuilder getOrderOrBuilder() {
      if (orderBuilder_ != null) {
        return orderBuilder_.getMessageOrBuilder();
      } else {
        return order_ == null ?
            com.example.grpc.server.grpcserver.order.ProtoOrder.getDefaultInstance() : order_;
      }
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.order.ProtoOrder order = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.server.grpcserver.order.ProtoOrder, com.example.grpc.server.grpcserver.order.ProtoOrder.Builder, com.example.grpc.server.grpcserver.order.ProtoOrderOrBuilder> 
        getOrderFieldBuilder() {
      if (orderBuilder_ == null) {
        orderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc.server.grpcserver.order.ProtoOrder, com.example.grpc.server.grpcserver.order.ProtoOrder.Builder, com.example.grpc.server.grpcserver.order.ProtoOrderOrBuilder>(
                getOrder(),
                getParentForChildren(),
                isClean());
        order_ = null;
      }
      return orderBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.server.grpcserver.order.CreateRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.server.grpcserver.order.CreateRequest)
  private static final com.example.grpc.server.grpcserver.order.CreateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.order.CreateRequest();
  }

  public static com.example.grpc.server.grpcserver.order.CreateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRequest>() {
    public CreateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRequest> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.server.grpcserver.order.CreateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


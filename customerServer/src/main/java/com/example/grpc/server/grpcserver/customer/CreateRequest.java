// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package com.example.grpc.server.grpcserver.customer;

/**
 * Protobuf type {@code com.example.grpc.server.grpcserver.customer.CreateRequest}
 */
public  final class CreateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.server.grpcserver.customer.CreateRequest)
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
            com.example.grpc.server.grpcserver.customer.ProtoCustomer.Builder subBuilder = null;
            if (customer_ != null) {
              subBuilder = customer_.toBuilder();
            }
            customer_ = input.readMessage(com.example.grpc.server.grpcserver.customer.ProtoCustomer.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customer_);
              customer_ = subBuilder.buildPartial();
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
    return com.example.grpc.server.grpcserver.customer.Customer.internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.server.grpcserver.customer.Customer.internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.server.grpcserver.customer.CreateRequest.class, com.example.grpc.server.grpcserver.customer.CreateRequest.Builder.class);
  }

  public static final int CUSTOMER_FIELD_NUMBER = 1;
  private com.example.grpc.server.grpcserver.customer.ProtoCustomer customer_;
  /**
   * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
   */
  public boolean hasCustomer() {
    return customer_ != null;
  }
  /**
   * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
   */
  public com.example.grpc.server.grpcserver.customer.ProtoCustomer getCustomer() {
    return customer_ == null ? com.example.grpc.server.grpcserver.customer.ProtoCustomer.getDefaultInstance() : customer_;
  }
  /**
   * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
   */
  public com.example.grpc.server.grpcserver.customer.ProtoCustomerOrBuilder getCustomerOrBuilder() {
    return getCustomer();
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
    if (customer_ != null) {
      output.writeMessage(1, getCustomer());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customer_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCustomer());
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
    if (!(obj instanceof com.example.grpc.server.grpcserver.customer.CreateRequest)) {
      return super.equals(obj);
    }
    com.example.grpc.server.grpcserver.customer.CreateRequest other = (com.example.grpc.server.grpcserver.customer.CreateRequest) obj;

    boolean result = true;
    result = result && (hasCustomer() == other.hasCustomer());
    if (hasCustomer()) {
      result = result && getCustomer()
          .equals(other.getCustomer());
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
    if (hasCustomer()) {
      hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
      hash = (53 * hash) + getCustomer().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.server.grpcserver.customer.CreateRequest parseFrom(
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
  public static Builder newBuilder(com.example.grpc.server.grpcserver.customer.CreateRequest prototype) {
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
   * Protobuf type {@code com.example.grpc.server.grpcserver.customer.CreateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.server.grpcserver.customer.CreateRequest)
      com.example.grpc.server.grpcserver.customer.CreateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.server.grpcserver.customer.Customer.internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.server.grpcserver.customer.Customer.internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.server.grpcserver.customer.CreateRequest.class, com.example.grpc.server.grpcserver.customer.CreateRequest.Builder.class);
    }

    // Construct using com.example.grpc.server.grpcserver.customer.CreateRequest.newBuilder()
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
      if (customerBuilder_ == null) {
        customer_ = null;
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.server.grpcserver.customer.Customer.internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_descriptor;
    }

    public com.example.grpc.server.grpcserver.customer.CreateRequest getDefaultInstanceForType() {
      return com.example.grpc.server.grpcserver.customer.CreateRequest.getDefaultInstance();
    }

    public com.example.grpc.server.grpcserver.customer.CreateRequest build() {
      com.example.grpc.server.grpcserver.customer.CreateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.server.grpcserver.customer.CreateRequest buildPartial() {
      com.example.grpc.server.grpcserver.customer.CreateRequest result = new com.example.grpc.server.grpcserver.customer.CreateRequest(this);
      if (customerBuilder_ == null) {
        result.customer_ = customer_;
      } else {
        result.customer_ = customerBuilder_.build();
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
      if (other instanceof com.example.grpc.server.grpcserver.customer.CreateRequest) {
        return mergeFrom((com.example.grpc.server.grpcserver.customer.CreateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.server.grpcserver.customer.CreateRequest other) {
      if (other == com.example.grpc.server.grpcserver.customer.CreateRequest.getDefaultInstance()) return this;
      if (other.hasCustomer()) {
        mergeCustomer(other.getCustomer());
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
      com.example.grpc.server.grpcserver.customer.CreateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.server.grpcserver.customer.CreateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.grpc.server.grpcserver.customer.ProtoCustomer customer_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.server.grpcserver.customer.ProtoCustomer, com.example.grpc.server.grpcserver.customer.ProtoCustomer.Builder, com.example.grpc.server.grpcserver.customer.ProtoCustomerOrBuilder> customerBuilder_;
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    public boolean hasCustomer() {
      return customerBuilder_ != null || customer_ != null;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    public com.example.grpc.server.grpcserver.customer.ProtoCustomer getCustomer() {
      if (customerBuilder_ == null) {
        return customer_ == null ? com.example.grpc.server.grpcserver.customer.ProtoCustomer.getDefaultInstance() : customer_;
      } else {
        return customerBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    public Builder setCustomer(com.example.grpc.server.grpcserver.customer.ProtoCustomer value) {
      if (customerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customer_ = value;
        onChanged();
      } else {
        customerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    public Builder setCustomer(
        com.example.grpc.server.grpcserver.customer.ProtoCustomer.Builder builderForValue) {
      if (customerBuilder_ == null) {
        customer_ = builderForValue.build();
        onChanged();
      } else {
        customerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    public Builder mergeCustomer(com.example.grpc.server.grpcserver.customer.ProtoCustomer value) {
      if (customerBuilder_ == null) {
        if (customer_ != null) {
          customer_ =
            com.example.grpc.server.grpcserver.customer.ProtoCustomer.newBuilder(customer_).mergeFrom(value).buildPartial();
        } else {
          customer_ = value;
        }
        onChanged();
      } else {
        customerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    public Builder clearCustomer() {
      if (customerBuilder_ == null) {
        customer_ = null;
        onChanged();
      } else {
        customer_ = null;
        customerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    public com.example.grpc.server.grpcserver.customer.ProtoCustomer.Builder getCustomerBuilder() {
      
      onChanged();
      return getCustomerFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    public com.example.grpc.server.grpcserver.customer.ProtoCustomerOrBuilder getCustomerOrBuilder() {
      if (customerBuilder_ != null) {
        return customerBuilder_.getMessageOrBuilder();
      } else {
        return customer_ == null ?
            com.example.grpc.server.grpcserver.customer.ProtoCustomer.getDefaultInstance() : customer_;
      }
    }
    /**
     * <code>.com.example.grpc.server.grpcserver.customer.ProtoCustomer customer = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.grpc.server.grpcserver.customer.ProtoCustomer, com.example.grpc.server.grpcserver.customer.ProtoCustomer.Builder, com.example.grpc.server.grpcserver.customer.ProtoCustomerOrBuilder> 
        getCustomerFieldBuilder() {
      if (customerBuilder_ == null) {
        customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.grpc.server.grpcserver.customer.ProtoCustomer, com.example.grpc.server.grpcserver.customer.ProtoCustomer.Builder, com.example.grpc.server.grpcserver.customer.ProtoCustomerOrBuilder>(
                getCustomer(),
                getParentForChildren(),
                isClean());
        customer_ = null;
      }
      return customerBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.server.grpcserver.customer.CreateRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.server.grpcserver.customer.CreateRequest)
  private static final com.example.grpc.server.grpcserver.customer.CreateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.server.grpcserver.customer.CreateRequest();
  }

  public static com.example.grpc.server.grpcserver.customer.CreateRequest getDefaultInstance() {
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

  public com.example.grpc.server.grpcserver.customer.CreateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


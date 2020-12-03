// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package com.example.grpc.server.grpcserver.customer;

public final class Customer {
  private Customer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_customer_ProtoCustomer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_customer_ProtoCustomer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_customer_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_customer_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_customer_GetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_customer_GetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_customer_CreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_customer_CreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016customer.proto\022+com.example.grpc.serve" +
      "r.grpcserver.customer\";\n\rProtoCustomer\022\014" +
      "\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\017\n\007request\030\003 \001" +
      "(\005\"!\n\nGetRequest\022\023\n\013customer_id\030\001 \001(\t\"\036\n" +
      "\013GetResponse\022\017\n\007request\030\001 \001(\005\"]\n\rCreateR" +
      "equest\022L\n\010customer\030\001 \001(\0132:.com.example.g" +
      "rpc.server.grpcserver.customer.ProtoCust" +
      "omer\"\034\n\016CreateResponse\022\n\n\002id\030\001 \001(\t2\217\002\n\017C" +
      "ustomerService\022x\n\003get\0227.com.example.grpc" +
      ".server.grpcserver.customer.GetRequest\0328",
      ".com.example.grpc.server.grpcserver.cust" +
      "omer.GetResponse\022\201\001\n\006create\022:.com.exampl" +
      "e.grpc.server.grpcserver.customer.Create" +
      "Request\032;.com.example.grpc.server.grpcse" +
      "rver.customer.CreateResponseB\002P\001b\006proto3"
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
    internal_static_com_example_grpc_server_grpcserver_customer_ProtoCustomer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_grpcserver_customer_ProtoCustomer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_customer_ProtoCustomer_descriptor,
        new java.lang.String[] { "Name", "Age", "Request", });
    internal_static_com_example_grpc_server_grpcserver_customer_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_grpcserver_customer_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_customer_GetRequest_descriptor,
        new java.lang.String[] { "CustomerId", });
    internal_static_com_example_grpc_server_grpcserver_customer_GetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_server_grpcserver_customer_GetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_customer_GetResponse_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_customer_CreateRequest_descriptor,
        new java.lang.String[] { "Customer", });
    internal_static_com_example_grpc_server_grpcserver_customer_CreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_grpc_server_grpcserver_customer_CreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_customer_CreateResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

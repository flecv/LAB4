// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: director.proto

package com.example.grpc.server.grpcserver.director;

public final class Director {
  private Director() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_director_ProtoDirector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_director_ProtoDirector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_director_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_director_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_director_GetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_director_GetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_director_CreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_director_CreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_director_CreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_director_CreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016director.proto\022+com.example.grpc.serve" +
      "r.grpcserver.director\"C\n\rProtoDirector\022\014" +
      "\n\004name\030\001 \001(\t\022\023\n\013wood_amount\030\002 \001(\005\022\017\n\007bal" +
      "ance\030\003 \001(\005\"#\n\nGetRequest\022\025\n\rdirector_nam" +
      "e\030\001 \001(\t\"[\n\013GetResponse\022L\n\010director\030\001 \003(\013" +
      "2:.com.example.grpc.server.grpcserver.di" +
      "rector.ProtoDirector\"]\n\rCreateRequest\022L\n" +
      "\010director\030\001 \001(\0132:.com.example.grpc.serve" +
      "r.grpcserver.director.ProtoDirector\"\036\n\016C" +
      "reateResponse\022\014\n\004name\030\001 \001(\t2\217\002\n\017Director",
      "Service\022x\n\003get\0227.com.example.grpc.server" +
      ".grpcserver.director.GetRequest\0328.com.ex" +
      "ample.grpc.server.grpcserver.director.Ge" +
      "tResponse\022\201\001\n\006create\022:.com.example.grpc." +
      "server.grpcserver.director.CreateRequest" +
      "\032;.com.example.grpc.server.grpcserver.di" +
      "rector.CreateResponseB\002P\001b\006proto3"
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
    internal_static_com_example_grpc_server_grpcserver_director_ProtoDirector_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_grpcserver_director_ProtoDirector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_director_ProtoDirector_descriptor,
        new java.lang.String[] { "Name", "WoodAmount", "Balance", });
    internal_static_com_example_grpc_server_grpcserver_director_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_grpcserver_director_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_director_GetRequest_descriptor,
        new java.lang.String[] { "DirectorName", });
    internal_static_com_example_grpc_server_grpcserver_director_GetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_server_grpcserver_director_GetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_director_GetResponse_descriptor,
        new java.lang.String[] { "Director", });
    internal_static_com_example_grpc_server_grpcserver_director_CreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_grpc_server_grpcserver_director_CreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_director_CreateRequest_descriptor,
        new java.lang.String[] { "Director", });
    internal_static_com_example_grpc_server_grpcserver_director_CreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_grpc_server_grpcserver_director_CreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_director_CreateResponse_descriptor,
        new java.lang.String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: director.proto

package com.example.grpc.server.grpcserver.director;

public interface GetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.server.grpcserver.director.GetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  java.util.List<com.example.grpc.server.grpcserver.director.ProtoDirector> 
      getDirectorList();
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  com.example.grpc.server.grpcserver.director.ProtoDirector getDirector(int index);
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  int getDirectorCount();
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  java.util.List<? extends com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder> 
      getDirectorOrBuilderList();
  /**
   * <code>repeated .com.example.grpc.server.grpcserver.director.ProtoDirector director = 1;</code>
   */
  com.example.grpc.server.grpcserver.director.ProtoDirectorOrBuilder getDirectorOrBuilder(
      int index);
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: update.proto

package com.example.grpc.server.grpcserver.updating;

public interface UpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.server.grpcserver.updating.UpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string director_name = 1;</code>
   */
  java.lang.String getDirectorName();
  /**
   * <code>string director_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDirectorNameBytes();

  /**
   * <code>int32 added_amount = 2;</code>
   */
  int getAddedAmount();

  /**
   * <code>int32 added_balance = 3;</code>
   */
  int getAddedBalance();
}
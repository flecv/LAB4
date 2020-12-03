package com.example.demo.controllers;

import com.example.grpc.server.grpcserver.customer.*;
import com.example.grpc.server.grpcserver.customer.GetRequest;
import com.example.grpc.server.grpcserver.customer.GetResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CustomerController extends CustomerServiceImpl{
    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();
        CustomerServiceGrpc.CustomerServiceBlockingStud stud = CustomerServiceGrpc.newBlockingStud(channel);
        GetResponse response = stub.get(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }
    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9092)
                .usePlaintext()
                .build();
        CustomerServiceGrpc.CustomerServiceBlockingStub stub = CustomerServiceGrpc.newBlockingStub(channel);
        CreateResponse response = stub.create(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

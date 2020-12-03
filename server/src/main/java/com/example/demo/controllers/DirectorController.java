package com.example.demo.controllers;

import com.example.grpc.server.grpcserver.customer.CreateRequest;
import com.example.grpc.server.grpcserver.customer.CreateResponse;
import com.example.grpc.server.grpcserver.customer.GetRequest;
import com.example.grpc.server.grpcserver.customer.GetResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class DirectorController extends DirectorServiceImplBase{
    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9094)
                .usePlaintext()
                .build();
        DirectorServiceGrpc.DirectorServiceBlockingStud stud = DirectorServiceGrpc.newBlockingStud(channel);
        GetResponse response = stub.get(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }
    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9094)
                .usePlaintext()
                .build();
        DirectorServiceGrpc.DirectorServiceBlockingStub stub = DirectorServiceGrpc.newBlockingStub(channel);
        CreateResponse response = stub.create(request);
        channel.shutdown();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

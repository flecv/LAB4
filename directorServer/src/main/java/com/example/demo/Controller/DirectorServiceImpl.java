package com.example.demo.Controller;

import com.example.demo.service.DirectorClass.Director;
import com.example.demo.service.DirectorService;
import com.example.grpc.server.grpcserver.director.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class DirectorServiceImpl extends DirectorServiceGrpc.DirectorServiceImplBase {
    private final DirectorService directorService;

    @Autowired
    public DirectorServiceImpl(DirectorService directorService)
    {
        this.directorService=directorService;
    }

    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver)
    {
        String name = "Konrad";
        int woodAmount = request.getDirector().getWoodAmount();
        int balance = request.getDirector().getBalance();
        Director director = directorService.createDirector(woodAmount, balance);

        CreateResponse response = CreateResponse.newBuilder()
                .setName(director.getName())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        Director director = directorService.getDirectorByName();

            ProtoDirector protoDirector = ProtoDirector.newBuilder()
                    .setName("Konrad")
                    .setWoodAmount(director.getWoodAmount())
                    .setBalance(director.getBalance())
                    .build();

        GetResponse response = GetResponse.newBuilder().addDirector(protoDirector).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

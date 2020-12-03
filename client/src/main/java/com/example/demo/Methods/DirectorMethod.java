package com.example.demo.Methods;

import com.example.grpc.server.grpcserver.director.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public final class DirectorMethod {

    public void createDirector()
    {
        ManagedChannel channel = ManagedChannelBuilder.
                forAddress("localhost", 9091)
                .usePlaintext()
                .build();

        DirectorServiceGrpc.DirectorServiceBlockingStub stub = DirectorServiceGrpc.newBlockingStub(channel);
        ProtoDirector protoDirector = ProtoDirector.newBuilder()
                .setName("Konrad")
                .setWoodAmount(100)
                .setBalance(0)
                .build();
        stub.create(CreateRequest.newBuilder().setDirector(protoDirector).build());
        channel.shutdown();
    }
    public void directorReport() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
        DirectorServiceGrpc.DirectorServiceBlockingStub stub = DirectorServiceGrpc.newBlockingStub(channel);

        GetResponse response = stub.get(GetRequest.newBuilder().build());
        channel.shutdown();

        ProtoDirector protoDirector = response.getDirector("Konrad");
        String report = "Director report";
        report += protoDirector.getName() + " wood amount is " + protoDirector.getWoodAmount() + ", balance is " + protoDirector.getBalance() + "\n";

        System.out.println(report);
    }
}

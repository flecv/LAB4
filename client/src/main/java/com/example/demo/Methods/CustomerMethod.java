package com.example.demo.Methods;

import com.example.grpc.server.grpcserver.customer.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public final class CustomerMethod {
    public void createCustomer()
    {
        ManagedChannel channel = ManagedChannelBuilder.
                forAddress("localhost", 9091)
                .usePlaintext()
                .build();

        CustomerServiceGrpc.CustomerServiceBlockingStub stub = CustomerServiceGrpc.newBlockingStub(channel);
        ProtoCustomer protoCustomer = ProtoCustomer.newBuilder()
                .setName("Vigor")
                .setRequest(100)
                .setAge(30)
                .build();
        stub.create(CreateRequest.newBuilder().setCustomer(protoCustomer).build());
        channel.shutdown();
    }
    public void customerReport() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
        CustomerServiceGrpc.CustomerServiceBlockingStub stub = CustomerServiceGrpc.newBlockingStub(channel);

        GetResponse response = stub.get(GetRequest.newBuilder().build());
        channel.shutdown();

        List<ProtoCustomer> customers = response.getCustomersList();
        String report = "Customers report";

        for (ProtoCustomer protoCustomer : customers) {
            System.out.println(protoCustomer);
            report += protoCustomer.getName() + " age is " + protoCustomer.getAge() + ", request is " + protoCustomer.getRequest() + "\n";
        }

        System.out.println(report);
    }
}

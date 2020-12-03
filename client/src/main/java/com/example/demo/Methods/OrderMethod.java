package com.example.demo.Methods;

import com.example.grpc.server.grpcserver.order.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public final class OrderMethod {
    public void createOrder(String customerId, int customerRequest)
    {
        ManagedChannel channel = ManagedChannelBuilder.
                forAddress("localhost", 9091)
                .usePlaintext()
                .build();

        OrderServiceGrpc.OrderServiceBlockingStub stub = OrderServiceGrpc.newBlockingStub(channel);
        ProtoOrder protoOrder = ProtoOrder.newBuilder()
                .setCustomerId(customerId)
                .setRequest(customerRequest)
                .setDirectorName("Konrad")
                .build();
        stub.create(CreateRequest.newBuilder().setOrder(protoOrder).build());
        channel.shutdown();
    }
    public void orderReport() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
        OrderServiceGrpc.OrderServiceBlockingStub stub = OrderServiceGrpc.newBlockingStub(channel);

        GetResponse response = stub.get(GetRequest.newBuilder().build());
        channel.shutdown();

        List<ProtoOrder> orders = response.getOrdersList();
        String report = "Order report";

        for (ProtoOrder protoOrder : orders) {
            System.out.println(protoOrder);
            report += "Order customer id is " + protoOrder.getCustomerId() + ", request is " + protoOrder.getRequest() + "\n";
        }

        System.out.println(report);
    }
    public void completeOrder(String orderId, String customerId)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
        OrderServiceGrpc.OrderServiceBlockingStub stub = OrderServiceGrpc.newBlockingStub(channel);

        stub.delete(DeleteRequest.newBuilder()
                .setOrderId(orderId)
                .setCustomerId(customerId)
                .build());
        channel.shutdown();
    }
}

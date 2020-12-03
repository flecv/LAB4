package com.example.demo.Controller;

import com.example.demo.service.OrderClass.Order;
import com.example.demo.service.OrderService;
import com.example.grpc.server.grpcserver.order.*;
import com.example.grpc.server.grpcserver.update.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class orderServerImpl extends OrderServiceGrpc.OrderServiceImplBase {
    private final OrderService orderService;

    @Autowired
    public orderServerImpl(OrderService orderService)
    {
        this.orderService=orderService;
    }


    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver)
    {
        int customerRequest = request.getOrder().getRequest();
        String customerId = request.getOrder().getCustomerId();
        String directorName = request.getOrder().getDirectorName();
        Order order = orderService.createOrder(customerRequest, customerId, directorName);

        CreateResponse response = CreateResponse.newBuilder().
                setId(order.getOrderId()).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver)
    {
        List<Order> orders = orderService.getOrders();

        List<ProtoOrder> protoOrders = new ArrayList<>();
        for(Order order: orders) {
            ProtoOrder protoOrder = ProtoOrder.newBuilder()
                    .setRequest(order.getRequest())
                    .setCustomerId(order.getCustomerId())
                    .setDirectorName(order.getDirectorId())
                    .build();
            protoOrders.add(protoOrder);
        }
        GetResponse response = GetResponse.newBuilder().addAllOrders(protoOrders).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void completeOrder(DeleteRequest request, StreamObserver<DeleteResponse> responseObserver)
    {
        String orderId = request.getOrderId();
        int price = orderService.getOrderById(orderId).getRequest() * 10;
        int amount = orderService.getOrderById(orderId).getRequest();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9094)
                .usePlaintext()
                .build();

        UpdatingBalanceServiceGrpc.UpdatingBalanceServiceBlockingStub stub = UpdatingBalanceServiceGrpc.newBlockingStub(channel);
        stub.update(UpdateRequest.newBuilder()
                .setAmount(amount)
                .setBalance(price)
                .build());
        channel.shutdown();
        DeleteResponse response = DeleteResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

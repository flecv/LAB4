package com.example.demo.Controller;

import com.example.demo.service.CustomerClass.Customer;
import com.example.demo.service.CustomerService;
import com.example.grpc.server.grpcserver.customer.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class CustomerServiceImpl extends CustomerServiceGrpc.CustomerServiceImplBase {
    private final CustomerService customerService;

    @Autowired
    public CustomerServiceImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void create(CreateRequest request, StreamObserver<CreateResponse> responseObserver)
    {
        String name = request.getCustomer().getName();
        int age = request.getCustomer().getAge();
        int customerRequest = request.getCustomer().getRequest();

        Customer customer = customerService.createCustomer(name, age, customerRequest);

        CreateResponse response = CreateResponse.newBuilder()
                .setId(customer.getId())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        List<Customer> customers = customerService.getCustomers();

        List<ProtoCustomer> protoCustomers = new ArrayList<>();
        for(Customer customer: customers) {
            ProtoCustomer protoCustomer = ProtoCustomer.newBuilder()
                    .setName(customer.getName())
                    .setAge(customer.getAge())
                    .setRequest(customer.getRequest())
                    .build();
            protoCustomers.add(protoCustomer);

        }
        GetResponse response = GetResponse.newBuilder().addAllCustomers(protoCustomers).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}

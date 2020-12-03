package com.example.demo.service;

import com.example.demo.service.OrderClass.Order;
import com.example.demo.service.OrderClass.OrderStatus;

import java.util.List;

public interface OrderService {
    Order createOrder(int request, String id, String name);

    Order getOrderById(String id);

    void updateStatus(String id, OrderStatus status);

    String OrderReport(String id);

    List<Order> getOrders();
}

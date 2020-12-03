package com.example.demo.service.impl;

import com.example.demo.service.OrderClass.Order;
import com.example.demo.service.OrderClass.OrderStatus;
import com.example.demo.service.OrderService;
import com.example.demo.service.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepo repo;

    @Autowired
    OrderServiceImpl(OrderRepo repo)
    {
        this.repo=repo;
    }

    @Override
    public Order createOrder(int customerRequest, String customerId, String directorName)
    {
        Order order = new Order(customerRequest, customerId, directorName);
        repo.save(order);
        return order;
    }

    @Override
    public Order getOrderById(String id)
    {
        return repo.findById(id).get();
    };

    @Override
    public void updateStatus(String id, OrderStatus newStatus)
    {
        Order order = repo.getOrderById(id);
        order.setStatus(newStatus);
        repo.save(order);
    }

    @Override
    public String OrderReport(String id)
    {
        Order order = repo.getOrderById(id);
        String report = order.toString();
        return report;
    };

    @Override
    public List<Order> getOrders() {
        List<Order> orders=(List<Order>)repo.findAll();
        return orders;
    }
}

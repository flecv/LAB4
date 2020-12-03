package com.example.demo.service.repository;

import com.example.demo.service.OrderClass.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order,String> {
    Order getOrderById(String id);
}

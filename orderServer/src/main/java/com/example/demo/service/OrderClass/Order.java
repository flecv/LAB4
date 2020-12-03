package com.example.demo.service.OrderClass;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name="orders")
@EnableAutoConfiguration
public class Order {

    @Id
    private String id;
    private int request;
    private String customerId;
    private String directorName;
    private OrderStatus status;

    public Order() {
    }

    public Order(int request, String customerId, String directorName) {
        this.id = UUID.randomUUID().toString();
        this.customerId = customerId;
        this.directorName = directorName;
        this.request = request;
        this.status = OrderStatus.isPreparing;
    }

    public int getRequest() {
        return request;
    }

    public void setRequest(int request) {
        this.request = request;
    }

    public String getOrderId() {
        return id;
    }

    public void setOrderId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDirectorId() {
        return directorName;
    }

    public void setDirectorId(String directorName) {
        this.directorName = directorName;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order request " + request + ". Order customerId " + customerId + ". Order directorId " + directorName + ". Order orderId " + id + ". Order status " + status;
    }
}
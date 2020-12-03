package com.example.demo.service;

import com.example.demo.service.CustomerClass.Customer;

import java.util.List;

public interface CustomerService {
    String customerReport(String id);

    Customer getCustomerById(String id);

    Customer createCustomer(String name, int age, int request);
    List<Customer> getCustomers();
}

package com.example.demo.service.impl;


import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerClass.Customer;
import com.example.demo.service.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepo repo;
    @Autowired
    public CustomerServiceImpl(CustomerRepo repo)
    {
        this.repo = repo;
    }

    @Override
    public Customer createCustomer(String name, int age, int request)
    {
        Customer customer = new Customer(name, age, request);
        repo.save(customer);
        return customer;
    }

    /*public Customer getCustomerByName(String name)
    {
        return repo.getCustomerByName(name);
    }*/
    @Override
    public Customer getCustomerById(String customerId)
    {
        return  repo.findById(customerId).get();
    }

    @Override
    public String customerReport(String customerId)
    {
        Customer customer = repo.getCustomerById(customerId);
        String report = customer.toString();
        return report;
    }
    @Override
    public List<Customer> getCustomers() {
        List<Customer> customers=(List<Customer>)repo.findAll();
        return customers;
    }
}

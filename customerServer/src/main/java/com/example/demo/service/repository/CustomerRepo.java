package com.example.demo.service.repository;

import com.example.demo.service.CustomerClass.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {
    Customer getCustomerById(String id);
}

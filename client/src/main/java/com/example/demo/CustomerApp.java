package com.example.demo;

import com.example.demo.Methods.CustomerMethod;
import com.example.demo.Methods.DirectorMethod;
import com.example.demo.Methods.OrderMethod;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CustomerApp
{
    public  static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        CustomerMethod customers = new CustomerMethod();
        customers.createCustomer();
        customers.customerReport();


        DirectorMethod director = new DirectorMethod();
        director.createDirector();
        director.directorReport();

        System.out.println("Please, enter ID of customer you`re working at:");
        String customerId = in.nextLine();

        OrderMethod order = new OrderMethod();
        order.createOrder(customerId, 100);

        System.out.println("Please, enter ID of order you`re working at:");
        String orderId = in.nextLine();
        order.completeOrder(customerId, orderId);
        director.directorReport();
    }
}

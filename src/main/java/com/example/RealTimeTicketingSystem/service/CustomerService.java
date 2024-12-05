package com.example.RealTimeTicketingSystem.service;

import com.example.RealTimeTicketingSystem.dto.Customer;

import java.util.List;


public interface   CustomerService {


    void addNewCustomer(Customer customer);

    List<Customer> retrieve();

    

    void deleteCustomerById(Long id);

    void updateCustomer(Customer customer);
}

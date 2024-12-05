package com.example.RealTimeTicketingSystem.controller;


import com.example.RealTimeTicketingSystem.dto.Customer;
import com.example.RealTimeTicketingSystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/customer")
@RestController
@CrossOrigin
@RequiredArgsConstructor

public class CustomerController {

     private final CustomerService customerService;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addNewCustomer(customer);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.retrieve();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
        return "Customer " + id + " deleted";
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer) {

        customerService.updateCustomer(customer);
    }
}

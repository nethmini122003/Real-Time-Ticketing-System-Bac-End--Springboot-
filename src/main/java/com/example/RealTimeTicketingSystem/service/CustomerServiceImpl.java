package com.example.RealTimeTicketingSystem.service;

import com.example.RealTimeTicketingSystem.dto.Customer;
import com.example.RealTimeTicketingSystem.entity.CustomerEntity;
import com.example.RealTimeTicketingSystem.repository.CustomerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepository;
    private final ObjectMapper mapper;


    @Override
    public void addNewCustomer(Customer customer) {

        CustomerEntity customerEntity = mapper.convertValue(customer, CustomerEntity.class);
        customerRepository.save(customerEntity);

    }

    @Override
    public List<Customer> retrieve() {

        ArrayList<Customer> customerList = new ArrayList<>();
        List<CustomerEntity> all = customerRepository.findAll();
        for (CustomerEntity customerEntity : all) {
            customerList.add(mapper.convertValue(customerEntity, Customer.class));
        }
        return customerList;

    }

    @Override
    public void deleteCustomerById(Long id) {
            customerRepository.deleteById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        if(customerRepository.existsById(customer.getId())) {
            customerRepository.save(mapper.convertValue(customer, CustomerEntity.class));
        }
    }
}

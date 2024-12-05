package com.example.RealTimeTicketingSystem.repository;

import com.example.RealTimeTicketingSystem.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository  extends JpaRepository<CustomerEntity, Long> {

}

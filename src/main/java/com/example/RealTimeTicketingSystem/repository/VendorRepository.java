package com.example.RealTimeTicketingSystem.repository;

import com.example.RealTimeTicketingSystem.dto.Vendor;
import com.example.RealTimeTicketingSystem.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<VendorEntity, Long> {

}

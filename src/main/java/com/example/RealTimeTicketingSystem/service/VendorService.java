package com.example.RealTimeTicketingSystem.service;

import com.example.RealTimeTicketingSystem.dto.Vendor;

import java.util.List;

public interface VendorService {

    void addNewVendor(Vendor vendor);

    void deleteVendorByID(Long id);

    List<Vendor> retrieve();

    void updateVendor(Vendor vendor);
}

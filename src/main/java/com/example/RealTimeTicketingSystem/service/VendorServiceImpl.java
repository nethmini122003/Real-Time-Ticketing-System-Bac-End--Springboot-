package com.example.RealTimeTicketingSystem.service;

import com.example.RealTimeTicketingSystem.dto.Vendor;
import com.example.RealTimeTicketingSystem.entity.VendorEntity;
import com.example.RealTimeTicketingSystem.repository.VendorRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService {

    private final VendorRepository vendorRepository;
    private final ObjectMapper mapper;


    @Override
    public void addNewVendor(Vendor vendor) {
       VendorEntity vendorEntity = mapper.convertValue(vendor , VendorEntity.class);
       vendorRepository.save(vendorEntity);
    }

    @Override
    public void deleteVendorByID(Long id) {
        vendorRepository.deleteById(id);
    }

    @Override
    public List<Vendor> retrieve() {

        ArrayList<Vendor> vendorList = new ArrayList<>();
        List<VendorEntity> all = vendorRepository.findAll();
        for(VendorEntity vendorEntity : all){
            Vendor vendor = mapper.convertValue(vendorEntity, Vendor.class);
            vendorList.add(vendor);
        }
        return vendorList;
    }

    @Override
    public void updateVendor(Vendor vendor) {
        if(vendorRepository.existsById(vendor.getId())){
            vendorRepository.save(mapper.convertValue(vendor ,VendorEntity.class));
        }


    }

}

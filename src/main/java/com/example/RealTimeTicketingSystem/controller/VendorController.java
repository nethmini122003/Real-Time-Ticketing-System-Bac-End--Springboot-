package com.example.RealTimeTicketingSystem.controller;

import com.example.RealTimeTicketingSystem.dto.Vendor;
import com.example.RealTimeTicketingSystem.service.VendorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/vendor")
@RestController
@CrossOrigin
@RequiredArgsConstructor
public class VendorController {
    private final VendorService vendorService;

    @PostMapping("/add")
    public void addVendor(@RequestBody Vendor vendor) {
        vendorService.addNewVendor(vendor);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVendor(@PathVariable Long id) {
        vendorService.deleteVendorByID(id);
        return "vendor successfully deleted";

    }

    @GetMapping
    public List<Vendor> getVendors() {
        return vendorService.retrieve();
    }

    @PutMapping("/update")
    public void updateVendor(@RequestBody Vendor vendor){
        vendorService.updateVendor(vendor);
    }
}

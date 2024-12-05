package com.example.RealTimeTicketingSystem.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {

    private Long id;
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhone;
    private String vendorEmail;

}

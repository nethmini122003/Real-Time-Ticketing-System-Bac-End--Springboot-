package com.example.RealTimeTicketingSystem.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Vendor")
public class VendorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhone;
    private String vendorEmail;

}

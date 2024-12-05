package com.example.RealTimeTicketingSystem.repository;

import com.example.RealTimeTicketingSystem.dto.Ticket;
import com.example.RealTimeTicketingSystem.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Long> {
}

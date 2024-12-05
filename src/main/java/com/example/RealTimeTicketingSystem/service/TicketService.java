package com.example.RealTimeTicketingSystem.service;

import com.example.RealTimeTicketingSystem.dto.Ticket;

import java.util.List;

public interface TicketService {
    void addNewTicket(Ticket ticket);

    void deleteTicketById(Long id);

    List<Ticket> retrieve();

    void updateTicket(Ticket ticket);
}

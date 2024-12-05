package com.example.RealTimeTicketingSystem.controller;

import com.example.RealTimeTicketingSystem.dto.Ticket;
import com.example.RealTimeTicketingSystem.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ticket")
@RestController
@CrossOrigin
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @PostMapping("/add")
    public void addTicket(@RequestBody Ticket ticket) {
        ticketService.addNewTicket(ticket);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicketById(id);
        return "Ticket deleted successfully";
    }

    @GetMapping
    public List<Ticket> getTickets() {
        return ticketService.retrieve();
    }

    @PutMapping("/update")
    public void updateTicket(@RequestBody Ticket ticket) {
        ticketService.updateTicket(ticket);
    }
}

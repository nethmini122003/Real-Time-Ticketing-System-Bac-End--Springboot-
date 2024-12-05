package com.example.RealTimeTicketingSystem.service;

import com.example.RealTimeTicketingSystem.dto.Ticket;
import com.example.RealTimeTicketingSystem.entity.CustomerEntity;
import com.example.RealTimeTicketingSystem.entity.TicketEntity;
import com.example.RealTimeTicketingSystem.repository.TicketRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final ObjectMapper mapper;


    @Override
    public void addNewTicket(Ticket ticket) {
        TicketEntity ticketEntity = mapper.convertValue(ticket, TicketEntity.class);
        ticketRepository.save(ticketEntity);

    }

    @Override
    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);

    }

    @Override
    public List<Ticket> retrieve() {
        ArrayList<Ticket> ticketList = new ArrayList<>();
        List<TicketEntity> all = ticketRepository.findAll();
        for (TicketEntity ticketEntity : all) {
            Ticket ticket = mapper.convertValue(ticketEntity , Ticket.class);
            ticketList.add(ticket);
        }
        return ticketList;
    }

    @Override
    public void updateTicket(Ticket ticket) {
        if(ticketRepository.existsById(ticket.getId())) {
            ticketRepository.save(mapper.convertValue(ticket , TicketEntity.class));
        }
    }
}

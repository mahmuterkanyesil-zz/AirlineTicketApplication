package com.yesil.application.airlineticketapplication.Service;

import com.yesil.application.airlineticketapplication.Model.Ticket;
import com.yesil.application.airlineticketapplication.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;
    Ticket ticket;

    public Ticket save (Ticket ticket)
    {
        double price = ticket.getPrice();
        price += 10;
        ticket.setPrice(price);
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> findById(long id)
    {
        return ticketRepository.findById(id);
    }

    public void cancelTicket (long id)
    {
        double price = ticket.getPrice();
        price -= 10;
        ticket.setPrice(price);
        ticketRepository.deleteById(id);
    }

}

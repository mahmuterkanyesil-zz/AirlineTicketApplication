package com.yesil.application.airlineticketapplication.Controller;

import com.yesil.application.airlineticketapplication.Model.Ticket;
import com.yesil.application.airlineticketapplication.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Ticket save(@RequestBody @Valid Ticket ticket){
        return ticketService.save(ticket);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@RequestBody @PathVariable long id)
    {
        ticketService.cancelTicket(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Ticket> findTicket(@PathVariable long id){
        return ticketService.findById(id);
    }
}

package com.yesil.application.airlineticketapplication.Repository;

import com.yesil.application.airlineticketapplication.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}

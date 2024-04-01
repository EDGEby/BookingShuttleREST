package by.edge.shuttle.service;

import by.edge.shuttle.dto.ticket.TicketDTO;
import by.edge.shuttle.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();

    Ticket getTicketById(Long id);

    Ticket saveTicket(TicketDTO ticket);

    void deleteTicket(Long id);
}

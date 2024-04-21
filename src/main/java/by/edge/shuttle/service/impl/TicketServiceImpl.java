package by.edge.shuttle.service.impl;

import by.edge.shuttle.exception.NotFoundException;
import by.edge.shuttle.repository.TicketRepository;
import by.edge.shuttle.dto.ticket.TicketDTO;
import by.edge.shuttle.entity.Ticket;
import by.edge.shuttle.mapper.TicketMapper;
import by.edge.shuttle.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final TicketMapper mapper;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Ticket with id %s not found".formatted(id)));
    }

    @Override
    public Ticket saveTicket(TicketDTO ticketDto) {
        Ticket ticket = mapper.toEntity(ticketDto);
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}

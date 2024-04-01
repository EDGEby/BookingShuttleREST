package by.edge.shuttle.mapper;

import by.edge.shuttle.dto.ticket.TicketCreateRequest;
import by.edge.shuttle.dto.ticket.TicketDTO;
import by.edge.shuttle.dto.ticket.TicketResponse;
import by.edge.shuttle.entity.Passenger;
import by.edge.shuttle.entity.Shuttle;
import by.edge.shuttle.entity.Stop;
import by.edge.shuttle.entity.Ticket;
import org.mapstruct.Mapper;

@Mapper
public interface TicketMapper {
    Ticket toEntity(TicketDTO ticketDTO);

    TicketDTO toDto(TicketCreateRequest createRequest,
                    Passenger passenger,
                    Shuttle shuttle,
                    Stop departureStop,
                    Stop destinationStop);

    TicketResponse toResponse(Ticket ticket);
}

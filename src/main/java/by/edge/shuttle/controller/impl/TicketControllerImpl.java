package by.edge.shuttle.controller.impl;

import by.edge.shuttle.dto.ticket.TicketCreateRequest;
import by.edge.shuttle.dto.ticket.TicketDTO;
import by.edge.shuttle.dto.ticket.TicketResponse;
import by.edge.shuttle.entity.Passenger;
import by.edge.shuttle.entity.Shuttle;
import by.edge.shuttle.entity.Stop;
import by.edge.shuttle.controller.TicketController;
import by.edge.shuttle.mapper.TicketMapper;
import by.edge.shuttle.service.PassengerService;
import by.edge.shuttle.service.ShuttleService;
import by.edge.shuttle.service.StopService;
import by.edge.shuttle.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TicketControllerImpl implements TicketController {
    private final TicketService ticketService;
    private final StopService stopService;
    private final ShuttleService shuttleService;
    private final PassengerService passengerService;
    private final TicketMapper mapper;

    @GetMapping
    public List<TicketResponse> getAllTickets() {
        return ticketService.getAllTickets()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @GetMapping("/{id}")
    public TicketResponse getTicketById(@PathVariable Long id) {

        return mapper.toResponse(ticketService.getTicketById(id));
    }

    @PostMapping
    public TicketResponse addTicket(@RequestBody TicketCreateRequest createRequest) {
        Passenger passenger = passengerService.getPassengerById(createRequest.getPassengerId());
        Shuttle shuttle = shuttleService.getShuttleById(createRequest.getShuttleId());
        Stop departureStop = stopService.getStopById(createRequest.getDepartureStopId());
        Stop destinationStop = stopService.getStopById(createRequest.getDestinationStopId());
        TicketDTO ticketDto = mapper.toDto(createRequest, passenger, shuttle, departureStop, destinationStop);
        return mapper.toResponse(ticketService.saveTicket(ticketDto));
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }
}

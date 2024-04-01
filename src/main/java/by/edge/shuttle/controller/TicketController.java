package by.edge.shuttle.controller;

import by.edge.shuttle.dto.ticket.TicketCreateRequest;
import by.edge.shuttle.dto.ticket.TicketResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/tickets")
public interface TicketController {

    @GetMapping
    List<TicketResponse> getAllTickets();

    @GetMapping("/{id}")
    TicketResponse getTicketById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    TicketResponse addTicket(@Valid @RequestBody TicketCreateRequest createRequest);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteTicket(@PathVariable Long id);
}

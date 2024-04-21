package by.edge.shuttle.dto.ticket;

import by.edge.shuttle.entity.Passenger;
import by.edge.shuttle.entity.Shuttle;
import by.edge.shuttle.entity.Stop;
import lombok.Data;

import java.time.LocalTime;

@Data
public class TicketUpdateRequest {
    private Passenger passenger;
    private Shuttle shuttle;
    private Stop departureStop;
    private Stop destinationStop;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
}

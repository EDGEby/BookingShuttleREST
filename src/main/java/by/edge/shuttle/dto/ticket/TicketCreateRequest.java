package by.edge.shuttle.dto.ticket;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalTime;

@Data
public class TicketCreateRequest {
    @NotNull(message = "Passenger ID must not be null")
    private Long passengerId;

    @NotNull(message = "Shuttle ID must not be null")
    private Long shuttleId;

    @NotNull(message = "Departure Stop ID must not be null")
    private Long departureStopId;

    @NotNull(message = "Destination Stop ID must not be null")
    private Long destinationStopId;

    @NotNull(message = "Departure Time must not be null")
    private LocalTime departureTime;

    @NotNull(message = "Arrival Time must not be null")
    private LocalTime arrivalTime;
}

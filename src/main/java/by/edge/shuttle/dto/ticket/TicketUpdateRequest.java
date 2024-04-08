package by.edge.shuttle.dto.ticket;

import by.edge.shuttle.entity.Passenger;
import by.edge.shuttle.entity.Shuttle;
import by.edge.shuttle.entity.Stop;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalTime;

@Data
public class TicketUpdateRequest {
    @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")
    private LocalTime departureTime;
    @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$")
    private LocalTime arrivalTime;
}

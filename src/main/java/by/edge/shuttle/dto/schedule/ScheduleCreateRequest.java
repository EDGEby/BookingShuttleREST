package by.edge.shuttle.dto.schedule;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalTime;

@Data
public class ScheduleCreateRequest {
    @NotNull(message = "Departure Time must not be null")
    private LocalTime departureTime;

    @NotNull(message = "Arrival Time must not be blank")
    private LocalTime arrivalTime;

    @NotNull(message = "Route ID must not be null")
    private Long routeId;
}

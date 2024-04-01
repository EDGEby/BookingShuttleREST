package by.edge.shuttle.dto.schedule;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalTime;

@Data
public class ScheduleCreateRequest {
    @NotNull(message = "Departure Time must not be null")
    @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$", message = "Invalid time format")
    private LocalTime departureTime;

    @NotNull(message = "Arrival Time must not be blank")
    @Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$", message = "Invalid time format")
    private LocalTime arrivalTime;

    @NotNull(message = "Route ID must not be null")
    private Long routeId;
}

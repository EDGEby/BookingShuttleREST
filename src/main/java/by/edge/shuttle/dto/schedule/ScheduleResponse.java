package by.edge.shuttle.dto.schedule;

import by.edge.shuttle.dto.route.RouteResponse;
import lombok.Data;

import java.time.LocalTime;

@Data
public class ScheduleResponse {
    private Long id;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private RouteResponse route;
}

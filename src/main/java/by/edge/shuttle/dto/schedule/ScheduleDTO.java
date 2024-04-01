package by.edge.shuttle.dto.schedule;

import by.edge.shuttle.entity.Route;
import lombok.Data;

@Data
public class ScheduleDTO {
    private String departureTime;
    private String arrivalTime;
    private Route route;
}

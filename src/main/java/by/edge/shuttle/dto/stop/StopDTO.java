package by.edge.shuttle.dto.stop;

import by.edge.shuttle.entity.Route;
import lombok.Data;

@Data
public class StopDTO {
    private String name;
    private Double latitude;
    private Double longitude;
    private Route route;
}

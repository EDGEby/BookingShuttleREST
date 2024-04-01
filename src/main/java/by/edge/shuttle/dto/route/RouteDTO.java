package by.edge.shuttle.dto.route;

import by.edge.shuttle.entity.Driver;
import lombok.Data;

@Data
public class RouteDTO {
    private String name;
    private Boolean isActive;
    private Driver driver;
}

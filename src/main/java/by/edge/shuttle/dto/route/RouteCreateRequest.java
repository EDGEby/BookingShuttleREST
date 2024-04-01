package by.edge.shuttle.dto.route;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RouteCreateRequest {
    @NotNull(message = "Name must not be null")
    private String name;

    @NotNull(message = "isActive must not be null")
    private Boolean isActive;

    @NotNull(message = "Driver ID must not be null")
    private Long driverId;
}

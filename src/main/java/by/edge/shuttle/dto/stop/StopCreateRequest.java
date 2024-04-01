package by.edge.shuttle.dto.stop;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StopCreateRequest {
    @NotNull(message = "Name must not be null")
    private String name;

    @NotNull(message = "Latitude must not be null")
    private Double latitude;

    @NotNull(message = "Longitude must not be null")
    private Double longitude;

    @NotNull(message = "Route ID must not be null")
    private Long routeId;
}

package by.edge.shuttle.dto.shuttle;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ShuttleCreateRequest {
    @NotNull(message = "Capacity must not be null")
    private Integer capacity;

    @NotNull(message = "License Plate must not be null")
    private String licensePlate;

    @NotNull(message = "Model must not be null")
    private String model;
}

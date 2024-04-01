package by.edge.shuttle.dto.shuttle;

import lombok.Data;

@Data
public class ShuttleUpdateRequest {
    private Integer capacity;
    private String licensePlate;
    private String model;
}

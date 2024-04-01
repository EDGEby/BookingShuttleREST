package by.edge.shuttle.dto.shuttle;

import lombok.Data;

@Data
public class ShuttleResponse {
    private Long id;
    private Integer capacity;
    private String licensePlate;
    private String model;
}

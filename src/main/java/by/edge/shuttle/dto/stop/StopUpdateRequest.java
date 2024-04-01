package by.edge.shuttle.dto.stop;

import lombok.Data;

@Data
public class StopUpdateRequest {
    private String name;
    private Double latitude;
    private Double longitude;
}

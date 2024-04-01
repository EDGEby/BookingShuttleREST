package by.edge.shuttle.dto.driver;

import lombok.Data;

@Data
public class DriverUpdateRequest {
    private String name;
    private String email;
    private String phone;
}

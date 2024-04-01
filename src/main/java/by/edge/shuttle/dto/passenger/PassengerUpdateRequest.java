package by.edge.shuttle.dto.passenger;

import lombok.Data;

@Data
public class PassengerUpdateRequest {
    private String name;
    private String email;
    private String phone;
}

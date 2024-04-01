package by.edge.shuttle.dto.passenger;

import lombok.Data;

@Data
public class PassengerResponse {
    private Long id;
    private String name;
    private String email;
    private String phone;
}

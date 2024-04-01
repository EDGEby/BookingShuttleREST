package by.edge.shuttle.dto.passenger;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PassengerCreateRequest {
    @NotNull(message = "Name must not be null")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Phone must not be null")
    private String phone;
}

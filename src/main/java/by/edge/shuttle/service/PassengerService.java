package by.edge.shuttle.service;

import by.edge.shuttle.dto.passenger.PassengerDTO;
import by.edge.shuttle.entity.Passenger;

import java.util.List;

public interface PassengerService {
    List<Passenger> getAllPassengers();

    Passenger getPassengerById(Long id);

    Passenger savePassenger(PassengerDTO passenger);

    void deletePassenger(Long id);
}

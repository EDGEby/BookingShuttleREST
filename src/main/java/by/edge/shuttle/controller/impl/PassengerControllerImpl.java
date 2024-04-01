package by.edge.shuttle.controller.impl;

import by.edge.shuttle.dto.passenger.PassengerCreateRequest;
import by.edge.shuttle.dto.passenger.PassengerResponse;
import by.edge.shuttle.controller.PassengerController;
import by.edge.shuttle.mapper.PassengerMapper;
import by.edge.shuttle.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PassengerControllerImpl implements PassengerController {
    private final PassengerService passengerService;
    private final PassengerMapper mapper;

    @Override
    public List<PassengerResponse> getAllPassengers() {
        return passengerService.getAllPassengers()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public PassengerResponse getPassengerById(Long id) {
        return mapper.toResponse(passengerService.getPassengerById(id));
    }

    @Override
    public PassengerResponse addPassenger(PassengerCreateRequest createRequest) {
        return mapper.toResponse(passengerService.savePassenger(mapper.toDto(createRequest)));
    }

    @Override
    public void deletePassenger(Long id) {
        passengerService.deletePassenger(id);
    }
}

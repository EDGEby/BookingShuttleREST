package by.edge.shuttle.service.impl;

import by.edge.shuttle.dto.passenger.PassengerDTO;
import by.edge.shuttle.entity.Passenger;
import by.edge.shuttle.repository.PassengerRepository;
import by.edge.shuttle.exception.NotFoundException;
import by.edge.shuttle.mapper.PassengerMapper;
import by.edge.shuttle.service.PassengerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;
    private final PassengerMapper mapper;

    @Override
    public List<Passenger> getAllPassengers() {
        log.info("{}", passengerRepository.findAll());
        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassengerById(Long id) {
        return passengerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Passenger with id %s not found".formatted(id)));
    }

    @Override
    public Passenger savePassenger(PassengerDTO passenger) {
        return passengerRepository.save(mapper.toEntity(passenger));
    }

    @Override
    public void deletePassenger(Long id) {
        passengerRepository.deleteById(id);
    }
}

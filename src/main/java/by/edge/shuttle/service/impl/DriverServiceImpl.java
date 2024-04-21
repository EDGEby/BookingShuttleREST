package by.edge.shuttle.service.impl;

import by.edge.shuttle.dto.passenger.PassengerDTO;
import by.edge.shuttle.entity.Passenger;
import by.edge.shuttle.exception.NotFoundException;
import by.edge.shuttle.repository.DriverRepository;
import by.edge.shuttle.dto.driver.DriverDTO;
import by.edge.shuttle.entity.Driver;
import by.edge.shuttle.mapper.DriverMapper;
import by.edge.shuttle.service.DriverService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;
    private final DriverMapper mapper;

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver getDriverById(Long id) {
        return driverRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Driver with id %s not found".formatted(id)));
    }

    @Override
    public Driver saveDriver(DriverDTO driver) {
        return driverRepository.save(mapper.toEntity(driver));
    }

    @Override
    public void deleteDriver(Long id) {
        driverRepository.deleteById(id);
    }

    @Override
    public Driver updateDriver(DriverDTO driver) {
        var existedDriver = driverRepository.findByEmail(driver.getEmail());
        var updatedDriver = mapper.toEntity(driver);
        if (existedDriver != null ) {
            updatedDriver.setId(existedDriver.getId());
        }
        return driverRepository.save(updatedDriver);
    }
}

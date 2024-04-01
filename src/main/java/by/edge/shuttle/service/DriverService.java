package by.edge.shuttle.service;

import by.edge.shuttle.dto.driver.DriverDTO;
import by.edge.shuttle.entity.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> getAllDrivers();

    Driver getDriverById(Long id);

    Driver saveDriver(DriverDTO driverDto);

    void deleteDriver(Long id);
}

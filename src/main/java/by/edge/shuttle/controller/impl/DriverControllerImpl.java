package by.edge.shuttle.controller.impl;

import by.edge.shuttle.dto.driver.DriverCreateRequest;
import by.edge.shuttle.dto.driver.DriverResponse;
import by.edge.shuttle.controller.DriverController;
import by.edge.shuttle.mapper.DriverMapper;
import by.edge.shuttle.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DriverControllerImpl implements DriverController {
    private final DriverService driverService;
    private final DriverMapper mapper;

    @Override
    public List<DriverResponse> getAllDrivers() {
        return driverService.getAllDrivers()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public DriverResponse getDriverById(Long id) {
        return mapper.toResponse(driverService.getDriverById(id));
    }

    @Override
    public DriverResponse addDriver(DriverCreateRequest createRequest) {
        return mapper.toResponse(driverService.saveDriver(mapper.toDto(createRequest)));
    }

    @Override
    public void deleteDriver(Long id) {
        driverService.deleteDriver(id);
    }
}

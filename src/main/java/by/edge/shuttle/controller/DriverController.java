package by.edge.shuttle.controller;

import by.edge.shuttle.dto.driver.DriverCreateRequest;
import by.edge.shuttle.dto.driver.DriverResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/drivers")
public interface DriverController {

    @GetMapping
    List<DriverResponse> getAllDrivers();

    @GetMapping("/{id}")
    DriverResponse getDriverById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    DriverResponse addDriver(@Valid @RequestBody DriverCreateRequest createRequest);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteDriver(@PathVariable Long id);
}

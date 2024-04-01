package by.edge.shuttle.controller;

import by.edge.shuttle.dto.stop.StopCreateRequest;
import by.edge.shuttle.dto.stop.StopResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/v1/stops")
public interface StopController {

    @GetMapping
    List<StopResponse> getAllStops();

    @GetMapping("/{id}")
    StopResponse getStopById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    StopResponse addStop(@Valid @RequestBody StopCreateRequest createRequest);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteStop(@PathVariable Long id);
}

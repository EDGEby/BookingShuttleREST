package by.edge.shuttle.controller;

import by.edge.shuttle.dto.shuttle.ShuttleCreateRequest;
import by.edge.shuttle.dto.shuttle.ShuttleResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/v1/shuttles")
public interface ShuttleController {
    @GetMapping
    List<ShuttleResponse> getAllShuttles();

    @GetMapping("/{id}")
    ShuttleResponse getShuttleById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ShuttleResponse addShuttle(@Valid @RequestBody ShuttleCreateRequest createRequest);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteShuttle(@PathVariable Long id);
}

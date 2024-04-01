package by.edge.shuttle.controller;

import by.edge.shuttle.dto.route.RouteCreateRequest;
import by.edge.shuttle.dto.route.RouteResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/routes")
public interface RouteController {

    @GetMapping
    List<RouteResponse> getAllRoutes();

    @GetMapping("/{id}")
    RouteResponse getRouteById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    RouteResponse addRoute(@Valid @RequestBody RouteCreateRequest createRequest);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteRoute(@PathVariable Long id);
}

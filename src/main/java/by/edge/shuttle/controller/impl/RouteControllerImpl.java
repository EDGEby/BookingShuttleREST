package by.edge.shuttle.controller.impl;

import by.edge.shuttle.dto.route.RouteCreateRequest;
import by.edge.shuttle.dto.route.RouteDTO;
import by.edge.shuttle.dto.route.RouteResponse;
import by.edge.shuttle.entity.Driver;
import by.edge.shuttle.controller.RouteController;
import by.edge.shuttle.mapper.RouteMapper;
import by.edge.shuttle.service.DriverService;
import by.edge.shuttle.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RouteControllerImpl implements RouteController {
    private final RouteService routeService;
    private final DriverService driverService;
    private final RouteMapper mapper;

    @Override
    public List<RouteResponse> getAllRoutes() {
        return routeService.getAllRoutes()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public RouteResponse getRouteById(Long id) {
        return mapper.toResponse(routeService.getRouteById(id));
    }

    @Override
    public RouteResponse addRoute(RouteCreateRequest createRequest) {
        Driver driver = driverService.getDriverById(createRequest.getDriverId());
        RouteDTO routeDto = mapper.toDto(createRequest, driver);
        return mapper.toResponse(routeService.saveRoute(routeDto));
    }

    @Override
    public void deleteRoute(Long id) {
        routeService.deleteRoute(id);
    }
}

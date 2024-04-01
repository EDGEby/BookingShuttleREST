package by.edge.shuttle.service;

import by.edge.shuttle.dto.route.RouteDTO;
import by.edge.shuttle.entity.Route;

import java.util.List;

public interface RouteService {
    List<Route> getAllRoutes();

    Route getRouteById(Long id);

    Route saveRoute(RouteDTO route);

    void deleteRoute(Long id);
}

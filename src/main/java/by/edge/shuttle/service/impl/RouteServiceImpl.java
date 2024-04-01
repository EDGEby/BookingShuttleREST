package by.edge.shuttle.service.impl;

import by.edge.shuttle.dto.route.RouteDTO;
import by.edge.shuttle.repository.RouteRepository;
import by.edge.shuttle.entity.Route;
import by.edge.shuttle.exception.NotFoundException;
import by.edge.shuttle.mapper.RouteMapper;
import by.edge.shuttle.service.RouteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final RouteMapper mapper;

    @Override
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @Override
    public Route getRouteById(Long id) {
        return routeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Route with id %s not found".formatted(id)));
    }

    @Override
    public Route saveRoute(RouteDTO route) {
        log.info("Route dto: {}", route);
        log.info("Route entity: {}", mapper.toEntity(route));
        return routeRepository.save(mapper.toEntity(route));
    }

    @Override
    public void deleteRoute(Long id) {
        routeRepository.deleteById(id);
    }
}

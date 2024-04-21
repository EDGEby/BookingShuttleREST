package by.edge.shuttle.controller.impl;

import by.edge.shuttle.controller.StopController;
import by.edge.shuttle.dto.stop.StopCreateRequest;
import by.edge.shuttle.dto.stop.StopDTO;
import by.edge.shuttle.dto.stop.StopResponse;
import by.edge.shuttle.entity.Route;
import by.edge.shuttle.mapper.StopMapper;
import by.edge.shuttle.service.RouteService;
import by.edge.shuttle.service.StopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StopControllerImpl implements StopController {
    private final StopService stopService;
    private final RouteService routeService;
    private final StopMapper mapper;

    @Override
    public List<StopResponse> getAllStops() {

        return stopService.getAllStops()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public StopResponse getStopById(Long id) {
        return mapper.toResponse(stopService.getStopById(id));
    }

    @Override
    public StopResponse addStop(StopCreateRequest createRequest) {
        Route route = routeService.getRouteById(createRequest.getRouteId());
        StopDTO stopDto = mapper.toDto(createRequest, route);
        return mapper.toResponse(stopService.saveStop(stopDto));
    }

    @Override
    public void deleteStop(Long id) {
        stopService.deleteStop(id);
    }
}

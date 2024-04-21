package by.edge.shuttle.controller.impl;

import by.edge.shuttle.controller.ScheduleController;
import by.edge.shuttle.dto.schedule.ScheduleCreateRequest;
import by.edge.shuttle.dto.schedule.ScheduleDTO;
import by.edge.shuttle.dto.schedule.ScheduleResponse;
import by.edge.shuttle.entity.Route;
import by.edge.shuttle.mapper.ScheduleMapper;
import by.edge.shuttle.service.RouteService;
import by.edge.shuttle.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleControllerImpl implements ScheduleController {
    private final ScheduleService scheduleService;
    private final RouteService routeService;
    private final ScheduleMapper mapper;

    @Override
    public List<ScheduleResponse> getAllSchedules() {
        return scheduleService.getAllSchedules()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public ScheduleResponse getScheduleById(Long id) {
        return mapper.toResponse(scheduleService.getScheduleById(id));
    }

    @Override
    public ScheduleResponse addSchedule(ScheduleCreateRequest createRequest) {
        Route route = routeService.getRouteById(createRequest.getRouteId());
        ScheduleDTO scheduleDto = mapper.toDto(createRequest, route);
        return mapper.toResponse(scheduleService.saveSchedule(scheduleDto));
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleService.deleteSchedule(id);
    }
}

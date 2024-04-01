package by.edge.shuttle.mapper;

import by.edge.shuttle.dto.schedule.ScheduleCreateRequest;
import by.edge.shuttle.dto.schedule.ScheduleDTO;
import by.edge.shuttle.dto.schedule.ScheduleResponse;
import by.edge.shuttle.entity.Route;
import by.edge.shuttle.entity.Schedule;
import org.mapstruct.Mapper;

@Mapper
public interface ScheduleMapper {
    ScheduleDTO toDto(ScheduleCreateRequest scheduleCreateRequest, Route route);

    Schedule toEntity(ScheduleDTO scheduleDTO);

    ScheduleResponse toResponse(Schedule scheduleDTO);
}

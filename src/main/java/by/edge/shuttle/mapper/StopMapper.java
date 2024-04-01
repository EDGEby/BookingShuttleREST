package by.edge.shuttle.mapper;

import by.edge.shuttle.dto.stop.StopCreateRequest;
import by.edge.shuttle.dto.stop.StopDTO;
import by.edge.shuttle.dto.stop.StopResponse;
import by.edge.shuttle.entity.Route;
import by.edge.shuttle.entity.Stop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StopMapper {
    Stop toEntity(StopDTO dto);

    @Mapping(target = "name", source = "createRequest.name")
    StopDTO toDto(StopCreateRequest createRequest, Route route);

    StopResponse toResponse(Stop stop);
}

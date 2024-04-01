package by.edge.shuttle.mapper;

import by.edge.shuttle.dto.route.RouteCreateRequest;
import by.edge.shuttle.dto.route.RouteDTO;
import by.edge.shuttle.dto.route.RouteResponse;
import by.edge.shuttle.entity.Driver;
import by.edge.shuttle.entity.Route;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface RouteMapper {
    Route toEntity(RouteDTO dto);

    @Mapping(target = "name", source = "createRequest.name")
    RouteDTO toDto(RouteCreateRequest createRequest, Driver driver);

    RouteResponse toResponse(Route route);
}

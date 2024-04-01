package by.edge.shuttle.mapper;

import by.edge.shuttle.dto.shuttle.ShuttleCreateRequest;
import by.edge.shuttle.dto.shuttle.ShuttleDTO;
import by.edge.shuttle.dto.shuttle.ShuttleResponse;
import by.edge.shuttle.entity.Shuttle;
import org.mapstruct.Mapper;

@Mapper
public interface ShuttleMapper {
    Shuttle toEntity(ShuttleDTO dto);

    ShuttleDTO toDto(ShuttleCreateRequest createRequest);

    ShuttleResponse toResponse(Shuttle shuttle);
}

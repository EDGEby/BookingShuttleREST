package by.edge.shuttle.mapper;

import by.edge.shuttle.dto.driver.DriverCreateRequest;
import by.edge.shuttle.dto.driver.DriverDTO;
import by.edge.shuttle.dto.driver.DriverResponse;
import by.edge.shuttle.dto.driver.DriverUpdateRequest;
import by.edge.shuttle.entity.Driver;
import org.mapstruct.Mapper;

@Mapper
public interface DriverMapper {
    Driver toEntity(DriverDTO dto);

    DriverDTO toDto(DriverCreateRequest createRequest);

    DriverDTO toDto(DriverUpdateRequest updateRequest);

    DriverResponse toResponse(Driver driver);
}

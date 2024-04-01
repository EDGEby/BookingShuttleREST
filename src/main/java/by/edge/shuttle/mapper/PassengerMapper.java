package by.edge.shuttle.mapper;

import by.edge.shuttle.dto.passenger.PassengerCreateRequest;
import by.edge.shuttle.dto.passenger.PassengerDTO;
import by.edge.shuttle.dto.passenger.PassengerResponse;
import by.edge.shuttle.entity.Passenger;
import org.mapstruct.Mapper;

@Mapper
public interface PassengerMapper {
    Passenger toEntity(PassengerDTO dto);

    PassengerDTO toDto(PassengerCreateRequest createRequest);

    PassengerResponse toResponse(Passenger passenger);
}

package by.edge.shuttle.service;

import by.edge.shuttle.dto.stop.StopDTO;
import by.edge.shuttle.entity.Stop;

import java.util.List;

public interface StopService {
    List<Stop> getAllStops();

    Stop getStopById(Long id);

    Stop saveStop(StopDTO stop);

    void deleteStop(Long id);
}

package by.edge.shuttle.service;

import by.edge.shuttle.dto.shuttle.ShuttleDTO;
import by.edge.shuttle.entity.Shuttle;

import java.util.List;

public interface ShuttleService {
    List<Shuttle> getAllShuttles();

    Shuttle getShuttleById(Long id);

    Shuttle saveShuttle(ShuttleDTO shuttle);

    void deleteShuttle(Long id);
}

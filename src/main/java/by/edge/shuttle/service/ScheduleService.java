package by.edge.shuttle.service;

import by.edge.shuttle.dto.schedule.ScheduleDTO;
import by.edge.shuttle.entity.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAllSchedules();

    Schedule getScheduleById(Long id);

    Schedule saveSchedule(ScheduleDTO schedule);

    void deleteSchedule(Long id);
}

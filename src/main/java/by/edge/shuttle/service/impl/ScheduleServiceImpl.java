package by.edge.shuttle.service.impl;

import by.edge.shuttle.dto.schedule.ScheduleDTO;
import by.edge.shuttle.repository.ScheduleRepository;
import by.edge.shuttle.entity.Schedule;
import by.edge.shuttle.exception.NotFoundException;
import by.edge.shuttle.mapper.ScheduleMapper;
import by.edge.shuttle.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final ScheduleMapper mapper;

    @Override
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule getScheduleById(Long id) {
        return scheduleRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Schedule with id %s not found".formatted(id)));
    }

    @Override
    public Schedule saveSchedule(ScheduleDTO scheduleDto) {
        Schedule schedule = mapper.toEntity(scheduleDto);
        return scheduleRepository.save(schedule);
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}

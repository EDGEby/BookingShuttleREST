package by.edge.shuttle.controller;

import by.edge.shuttle.dto.schedule.ScheduleCreateRequest;
import by.edge.shuttle.dto.schedule.ScheduleResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/schedules")
public interface ScheduleController {

    @GetMapping
    List<ScheduleResponse> getAllSchedules();

    @GetMapping("/{id}")
    ScheduleResponse getScheduleById(@PathVariable Long id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ScheduleResponse addSchedule(@Valid @RequestBody ScheduleCreateRequest createRequest);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteSchedule(@PathVariable Long id);
}

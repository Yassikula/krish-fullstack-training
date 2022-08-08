package yasasi.app.dispatchApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import yasasi.app.dispatchApp.model.ScheduleFuel;
import yasasi.app.dispatchApp.service.ScheduleService;

@RestController
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @PostMapping("/schedule")
    public ResponseEntity<ScheduleFuel> saveschedule(@RequestBody ScheduleFuel scheduleFuel) {
        return scheduleService.saveSchedule(scheduleFuel);
    }
}
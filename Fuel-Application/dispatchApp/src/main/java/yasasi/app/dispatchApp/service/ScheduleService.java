package yasasi.app.dispatchApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import yasasi.app.dispatchApp.model.ScheduleFuel;
import yasasi.app.dispatchApp.repository.SchRepository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Service
public class ScheduleService {


    @Autowired
    SchRepository schRepository;

    public ScheduleFuel scheduleDate(int orderId, String fuelType, int capacity) {



        ScheduleFuel schedule = new ScheduleFuel();
        schedule.setOrderId(orderId);
        schedule.setFuelType(fuelType);
        schedule.setQty(capacity);
        schedule.setScheduleDate();
        schedule.setStatus("Scheduled");
        saveSchedule(schedule);
        return schedule;

    }

    public ResponseEntity<ScheduleFuel> saveSchedule(ScheduleFuel schedule) {

        schRepository.save(schedule);

        return ResponseEntity.status(HttpStatus.OK).body(schedule);
    }

}

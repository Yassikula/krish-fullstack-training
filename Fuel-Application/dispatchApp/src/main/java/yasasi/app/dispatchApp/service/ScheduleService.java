package yasasi.app.dispatchApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import yasasi.app.dispatchApp.config.DispatcTopic;
import yasasi.app.dispatchApp.config.ScheduleTopic;
import yasasi.app.dispatchApp.model.ScheduleFuel;
import yasasi.app.dispatchApp.repository.SchRepository;

import java.time.LocalDate;


@Service
public class ScheduleService {


    @Autowired
    SchRepository schRepository;

    @Autowired
    KafkaTemplate<String,ScheduleFuel> kafkaTemplate;

    public ScheduleFuel scheduleDate(int orderId ) {



        ScheduleFuel schedule = new ScheduleFuel();
        schedule.setOrderId(orderId);
        schedule.setScheduleDate(LocalDate.now().plusDays(2).toString());
        saveSchedule(schedule);
        return schedule;

    }

    public ScheduleFuel saveSchedule(ScheduleFuel schedule) {

        kafkaTemplate.send(ScheduleTopic.MESSAGE_TOPIC,schedule);
        kafkaTemplate.send(DispatcTopic.MESSAGE_TOPIC,schedule);
           return schRepository.save(schedule);

    }

}

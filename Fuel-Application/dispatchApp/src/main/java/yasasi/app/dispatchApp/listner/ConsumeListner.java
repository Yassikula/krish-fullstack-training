package yasasi.app.dispatchApp.listner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import yasasi.app.dispatchApp.model.ReserveFuel;
import yasasi.app.dispatchApp.service.ScheduleService;

import java.util.List;

@Component
public class ConsumeListner {

    @Autowired
    ScheduleService scheduleService;

    @KafkaListener(topics = "kafka_inventory_topic", groupId = "group002")
    public void consumeJson(@Payload List<ReserveFuel> data){

        String value = String.valueOf(data);
        int OrderId = 0;
        String fuelType = "";
        int fuelqty = 0;

        ObjectMapper objectMapper = new ObjectMapper();
        try {
        List<ReserveFuel> reservedOrder = objectMapper.readValue(value, new TypeReference<List<ReserveFuel>>(){});
            for(ReserveFuel rs : reservedOrder) {
                OrderId = rs.getOrderId();
                fuelType = rs.getFuelType();
                fuelqty = rs.getQty();
            }

            } catch (JsonProcessingException e) {
                e.printStackTrace();
        }

        System.out.println(scheduleService.scheduleDate(OrderId,fuelType,fuelqty));

    }

}

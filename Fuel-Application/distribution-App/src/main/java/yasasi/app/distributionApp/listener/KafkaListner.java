package yasasi.app.distributionApp.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import yasasi.app.distributionApp.model.Dispatch;
import yasasi.app.distributionApp.service.DispatchService;

import java.util.List;

@Component
public class KafkaListner {


    @Autowired
    DispatchService dispatchService;


    @KafkaListener(topics = "kafka_dispatch_topic", groupId = "group003")
    public void consumeJson(@Payload List<Dispatch> data){

        String value = String.valueOf(data);
        int orderId = 0;
        String scheduleDate = "";



        ObjectMapper objectMapper = new ObjectMapper();
        try {

            List<Dispatch> reservedOrders = objectMapper.readValue(value, new TypeReference<List<Dispatch>>(){});
            for(Dispatch order : reservedOrders) {
                orderId  = order.getOrderId();
                scheduleDate = order.getScheduleDate();

            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(dispatchService.dispatchOrder(orderId , scheduleDate));

    }
}

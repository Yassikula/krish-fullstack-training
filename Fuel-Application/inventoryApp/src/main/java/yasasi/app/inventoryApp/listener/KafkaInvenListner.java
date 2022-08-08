package yasasi.app.inventoryApp.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import yasasi.app.inventoryApp.model.Order;

import yasasi.app.inventoryApp.service.FuelAvailabilityService;
import yasasi.app.inventoryApp.service.FuelReserveService;

import java.util.List;

@Component
public class KafkaInvenListner {


    @Autowired
    FuelAvailabilityService availabilityService;

    @Autowired
    FuelReserveService reserveSer;

    @KafkaListener(topics = "kafka_topic_order" ,groupId="group_001")
    public void consumeJson(@Payload List<Order> data){

        String value = String.valueOf(data);
        String fuelType = "";
        String OrderStatus = "";
        String StationId = "";
        int OrderId = 0;
        int fuelCapacity = 0;
        String Location = "";
        String StationName = "";

        ObjectMapper objectMapper = new ObjectMapper();
        try {

            List<Order> listorder = objectMapper.readValue(value, new TypeReference<List<Order>>(){});
            for(Order ord : listorder){
                System.out.println("Order Id ->  "+ord.getOrderId());
                System.out.println("Order Station Id -> "+ord.getStationId());
                System.out.println("Order amount -> "+ord.getAmount());
                System.out.println("Ordered Fuel Type -> "+ord.getFuelType());

                fuelType = ord.getFuelType();
                fuelCapacity = ord.getAmount();
                OrderStatus = ord.getStatus();
                StationId = ord.getStationId();
                OrderId  = ord.getOrderId();
                Location = ord.getLocation();
                StationName= ord.getStationName();


            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        System.out.println(availabilityService.getAmount(OrderId,fuelType,fuelCapacity));

    }
}

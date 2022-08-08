package yasasi.app.inventoryApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import yasasi.app.inventoryApp.config.KafkaTopic;
import yasasi.app.inventoryApp.model.ReserveFuel;
import yasasi.app.inventoryApp.repository.ReservedRepository;

@Service
public class FuelReserveService {


    @Autowired
    ReservedRepository reservedRepository;

    @Autowired
    KafkaTemplate<String, ReserveFuel> kafkaTemplate;


    public ReserveFuel saveReserved(ReserveFuel reserveFuel) {
        kafkaTemplate.send(KafkaTopic.MESSAGE_TOPIC,reserveFuel);

        return reservedRepository.save(reserveFuel);
    }


    public ReserveFuel getFromAvailable(int orderId, String fuelType, int capacity) {

        ReserveFuel reserveFuel = new ReserveFuel();
        reserveFuel.setOrderId(orderId);
        reserveFuel.setFuelType(fuelType);
        reserveFuel.setQty(capacity);
        return saveReserved(reserveFuel);
    }
}

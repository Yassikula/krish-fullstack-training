package yasasi.app.fuelApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import yasasi.app.fuelApp.model.Order;

import java.util.Optional;

@Repository
public interface OrderRepository extends MongoRepository<Order,String> {


    public Optional<Order> findByStationId(String stationId);
}

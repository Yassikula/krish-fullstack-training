package yasasi.app.inventoryApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import yasasi.app.inventoryApp.model.AvailableFuel;

@Repository
public interface AvailableRepository extends MongoRepository<AvailableFuel,Integer> {

    AvailableFuel findByFuelType(String type);


}

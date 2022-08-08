package yasasi.app.dispatchApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import yasasi.app.dispatchApp.model.ScheduleFuel;

@Repository
public interface SchRepository extends MongoRepository<ScheduleFuel, Integer> {
}

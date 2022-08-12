package yasasi.app.distributionApp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import yasasi.app.distributionApp.model.Dispatch;

@Repository
public interface DispatchRepository extends MongoRepository<Dispatch,Integer> {



}

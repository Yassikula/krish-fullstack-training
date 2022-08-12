package yasasi.app.distributionApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import yasasi.app.distributionApp.DispatchRepository;
import yasasi.app.distributionApp.model.Dispatch;

import java.util.List;

@Service
public class DispatchService {

    @Autowired
    DispatchRepository dispatchRepository;

    public Dispatch dispatchOrder(int orderId ,String scheduleDate){

        Dispatch disOrder = new Dispatch();
        disOrder.setOrderId(orderId);
        disOrder.setScheduleDate(scheduleDate);
        return saveDispatch(disOrder);
    }

    private Dispatch saveDispatch(Dispatch disOrder) {
        return dispatchRepository.save(disOrder);
    }

    public ResponseEntity<List<Dispatch>> getDispatches() {
        return ResponseEntity.status(HttpStatus.OK).body(dispatchRepository.findAll());
    }
}

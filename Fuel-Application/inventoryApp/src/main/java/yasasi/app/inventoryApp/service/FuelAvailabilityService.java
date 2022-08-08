package yasasi.app.inventoryApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import yasasi.app.inventoryApp.model.AvailableFuel;
import yasasi.app.inventoryApp.repository.AvailableRepository;
import java.util.List;

@Service
public class FuelAvailabilityService {

    @Autowired
    AvailableRepository availableRepository;

    @Autowired
    FuelReserveService reserveService;




    public ResponseEntity<AvailableFuel> saveAvailableFuel(AvailableFuel availableFuel) {
        try {
            availableRepository.save(availableFuel);

        }catch(Exception e) {

        }
        return ResponseEntity.status(HttpStatus.OK).body(availableFuel);    }


    public AvailableFuel getAmount(int orderId, String fuelType, int capacity) {

        AvailableFuel byFuelType = availableRepository.findByFuelType(fuelType);

        int availableAmount = byFuelType.getQty();
        if(availableAmount >= capacity);
        {
            StatusUpdated(orderId, "Allocate");
            int newAvailableAmount = availableAmount - capacity;
            saveAvailableFuel(byFuelType);
            reserveService.getFromAvailable(orderId,fuelType,capacity);
        }
        return byFuelType;
    }

    private void StatusUpdated(int orderId, String status) {
//        restTemplate.put("http://order/getorder/orderreceived/"+RefId+"/"+status, Order.class);
    }


    public void updateAvailableFuel(AvailableFuel availableFuel){
        availableRepository.save(availableFuel);
    }


    public List<AvailableFuel> getAllAvailable(){
        return availableRepository.findAll();
    }
}

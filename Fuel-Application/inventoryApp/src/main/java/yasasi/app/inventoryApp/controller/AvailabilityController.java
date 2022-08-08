package yasasi.app.inventoryApp.controller;

import org.apache.kafka.common.message.LeaderAndIsrRequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yasasi.app.inventoryApp.model.AvailableFuel;
import yasasi.app.inventoryApp.service.FuelAvailabilityService;

import java.util.List;

@RestController
public class AvailabilityController {

    @Autowired
    FuelAvailabilityService availabilityService;

    @PostMapping("/saveavailable")
    public ResponseEntity<AvailableFuel> saveAvailableFuel(@RequestBody AvailableFuel availableFuel) {
        return availabilityService.saveAvailableFuel(availableFuel);
    }

    @PutMapping("/update/available/{id}")
    public void updateAvailableFuel(@PathVariable int id,@RequestBody AvailableFuel availableFuel){
        availabilityService.updateAvailableFuel(availableFuel);

    }

    @GetMapping("/AllavailableFuel")
    public List<AvailableFuel> getAllAvailable(){
        return availabilityService.getAllAvailable();
    }
    }

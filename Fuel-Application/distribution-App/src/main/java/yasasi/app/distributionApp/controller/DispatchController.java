package yasasi.app.distributionApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yasasi.app.distributionApp.model.Dispatch;
import yasasi.app.distributionApp.service.DispatchService;

import java.util.List;

@RestController
@RequestMapping("api/v1/dispatch")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class DispatchController {

    @Autowired
    DispatchService dispatchService;

    @GetMapping("/getAlldispatches")
    public ResponseEntity<List<Dispatch>> getDispaches(){

        return dispatchService.getDispatches();
    }

//    @GetMapping("/getdispatchOrder")
//    public Dispatch dispatchOrder(@PathVariable int id, @PathVariable String scheduleDate){
//
//        return dispatchService.dispatchOrder(id, scheduleDate);
//    }

}

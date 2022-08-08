package yasasi.app.fuelApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yasasi.app.fuelApp.service.OrderService;
import yasasi.app.fuelApp.model.Order;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orderSubmit")
    public Order submitOrder(@RequestBody Order order){
        return orderService.submitOrder(order);

    }

    @GetMapping("/getAllorders")
    public ResponseEntity<List<Order>> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/getorder/{stationId}" )
    public ResponseEntity<Optional<Order>> getStationOrder(@PathVariable String stationId){
        return orderService.getStationOrder(stationId);
    }

    @PutMapping("/receiveOrder/{stationId}")
    public ResponseEntity<Order> OrderReceived(@PathVariable String stationId) {
        return orderService.OrderReceived(stationId);
    }




}

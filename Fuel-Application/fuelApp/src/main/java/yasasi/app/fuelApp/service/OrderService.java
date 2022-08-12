package yasasi.app.fuelApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import yasasi.app.fuelApp.model.Order;
import yasasi.app.fuelApp.repository.OrderRepository;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private KafkaTemplate<String, Order> orderkafkaTemplate;


    public Order submitOrder(Order order) {

//kafka message

        ListenableFuture<SendResult<String,Order>> future= orderkafkaTemplate.send("kafka_topic_order",order);
        future.addCallback(new ListenableFutureCallback() {
            @Override
            public void onFailure(Throwable ex) {

                System.out.println("Order not complete");
            }

            @Override
            public void onSuccess(Object result) {
                System.out.println("Order successfully complete");

            }
        });
        return orderRepository.save(order);
    }

    public ResponseEntity<List<Order>>  getAllOrders(){
       return ResponseEntity.status(HttpStatus.OK).body(orderRepository.findAll());
    }


    public ResponseEntity<List<Order>> getStationOrder(int stationId){
        return ResponseEntity.status(HttpStatus.OK).body(orderRepository.findByStationId(stationId));
    }


    public ResponseEntity<Order> OrderReceived(int id , String status){

        Optional<Order> selectedOrder= orderRepository.findById(id);
        if(selectedOrder.isPresent()){
            Order order=selectedOrder.get();
            order.setStatus(status);
            orderRepository.save(order);
            return ResponseEntity.status(HttpStatus.OK).body(order);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Order> OrderReceived(int id, String status, String scheduleDate) {

        Optional<Order> byId = orderRepository.findById(id);
        if(byId.isPresent()) {
            Order order = byId.get();
            order.setStatus(status);
            order.setScheduleDate(scheduleDate);

            orderRepository.save(order);

            return ResponseEntity.status(HttpStatus.OK).body(order);

        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

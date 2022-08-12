import { Component, OnInit } from '@angular/core';
import { Dispatch } from '../dispatch';
import {DispatchOrderService} from  '../dispatch-order.service';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-dispatch-order',
  templateUrl: './dispatch-order.component.html',
  styleUrls: ['./dispatch-order.component.css']
})
export class DispatchOrederComponent implements OnInit {

  dispatches =  null as any;

  constructor(private dispatchService : DispatchOrderService, private orderService:OrderService ) { }

  ngOnInit(): void {
    this.getAllOrders();
  }


  private getAllOrders(){
    this.dispatchService.getAllOrders().subscribe(resp =>{
      this.dispatches = resp;
      console.log(resp);
    })
  }

  dispatchOrder(orderId: any){
    this.orderService.getOrderComplete(orderId,"Dispatched").subscribe(resp =>{
    
      console.log(resp);
    },
    err => console.log(err));
  }

}

import { Component, OnInit } from '@angular/core';
import { Order } from '../order';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-order-check',
  templateUrl: './order-check.component.html',
  styleUrls: ['./order-check.component.css']
})
export class OrderCheckComponent implements OnInit {

  id!:number;
 
  orders = null as any;

  constructor(private orderService: OrderService) { }

  ngOnInit(): void {
  }

  getOrderById(){
    this.orderService.getOrderById(this.id).subscribe(data =>{
      this.orders = data;
      console.log(data);
    },
    error => console.log(error));
  }
}

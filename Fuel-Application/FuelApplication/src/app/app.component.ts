import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { OrderService } from './order.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FuelApplication';

  orderDetails = null as any;

  Order = status;
  id!:number;
  stationId!:number;

  orderUpdate ={
    status : ""

  };



  constructor(private orderService : OrderService){

    this.getStationsOrder();
  }


  submitted(registerForm : NgForm){
    this.orderService.orderSubmit(registerForm.value).subscribe(
      (resp) => {
        console.log(resp);
        registerForm.reset();
        this.getStationsOrder();
      },
      (err) => {
        console.log(err);
      }
    );
  }

  getStationsOrder(){
    
    this.orderService.getAllOrders().subscribe(
      
      (resp) => {
        console.log(resp);
      this.orderDetails= resp;
      },
      (err) => {
        console.log(err);
      }
    );
  }

  edit(order :any){
    this.orderUpdate = order;
  }

  updateOrder(orderId : any){
    this.orderService.OrderReceived(orderId, "Completed").subscribe(

      (resp) => {
        console.log(resp);
      this.getOrderById();
      },
      (err) => {
        console.log(err);
      }
    );
  }

  getOrderById(){
    this.orderService.getOrderById(this.id).subscribe(data =>{
      this.orderDetails = data;
      console.log(data);
    },
    error => console.log(error));
  }

 
}

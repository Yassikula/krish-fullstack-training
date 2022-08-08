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
  stationId!:number;

  orderUpdate ={
    orderId: "",
    stationId: "",
    stationName: "",
    location :"",
    fuelType: "",
    amount: "",
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

  updateOrder(){
    this.orderService.OrderReceived(this.orderUpdate).subscribe(

      (resp) => {
        console.log(resp);
      this.orderDetails= resp;
      },
      (err) => {
        console.log(err);
      }
    );
  }

  getOrderById(){
    this.orderService.getOrderById(this.stationId).subscribe(data =>{
      this.orderDetails = data;
      console.log(data);
    },
    error => console.log(error));
  }

}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

 
  constructor(private http: HttpClient) { }

  API = 'http://localhost:9090';
  public orderSubmit(orderData :any){
    return this.http.post(this.API + '/orderSubmit' , orderData);
}

public getAllOrders(){
  return this.http.get(this.API + '/getAllorders');

}
public OrderReceived(stationId : any){

  return this.http.get(this.API + '/receiveOrder/{stationId}', stationId);
}

public getOrderById(stationId : any){

  return this.http.get(this.API + 'getorder/{stationId}', stationId);

}

}

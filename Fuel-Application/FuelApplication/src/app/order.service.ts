import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
 

 
  constructor(private http: HttpClient) { }

  API = 'http://localhost:9090/backend/orders';
  public orderSubmit(orderData :any){
    return this.http.post(this.API + '/orderSubmit' , orderData);
}

public getAllOrders(){
  return this.http.get(this.API + '/getAllorders');

}
public OrderReceived(id : number, status : string){

  return this.http.put(`${this.API}/receiveOrder/${id}/${status}`, "");
}

public getOrderById(id : number): Observable<Order[]>{


  return this.http.get<Order[]>(`${this.API}/getorder/${id}`);

}
getOrderComplete(id: number, status: string) {
  return this.http.put(`${this.API}/receiveOrder/${id}/${status}`,"");
}


}

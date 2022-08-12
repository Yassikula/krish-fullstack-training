import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Dispatch } from './dispatch';

@Injectable({
  providedIn: 'root'
})
export class DispatchOrderService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:9091/backend/dispatch';

 

  public getAllOrders(){
    return this.http.get(this.API + '/getAlldispatches');
  
  }

  public getOrderById(id : number): Observable<Dispatch[]>{

  
    return this.http.get<Dispatch[]>(`${this.API}/${id}`);
  
  }

}

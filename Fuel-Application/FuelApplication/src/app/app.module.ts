import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OrderCheckComponent } from './order-check/order-check.component';
import { DispatchOrederComponent } from './dispatch-order/dispatch-order.component';


@NgModule({
  declarations: [
    AppComponent,
    OrderCheckComponent,
    DispatchOrederComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

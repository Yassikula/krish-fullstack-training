import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DispatchOrederComponent } from './dispatch-order/dispatch-order.component';
const routes: Routes = [

  {path: 'dispatch-order', component: DispatchOrederComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

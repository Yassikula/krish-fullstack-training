import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DispatchOrederComponent } from './dispatch-order.component';

describe('DispatchOrederComponent', () => {
  let component: DispatchOrederComponent;
  let fixture: ComponentFixture<DispatchOrederComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DispatchOrederComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DispatchOrederComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

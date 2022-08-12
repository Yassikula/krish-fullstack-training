import { TestBed } from '@angular/core/testing';

import { DispatchOrderService } from './dispatch-order.service';

describe('DispatchOrderService', () => {
  let service: DispatchOrderService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DispatchOrderService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailMvtStkComponent } from './detail-mvt-stk.component';

describe('DetailMvtStkComponent', () => {
  let component: DetailMvtStkComponent;
  let fixture: ComponentFixture<DetailMvtStkComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DetailMvtStkComponent]
    });
    fixture = TestBed.createComponent(DetailMvtStkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeatilUserComponent } from './deatil-user.component';

describe('DeatilUserComponent', () => {
  let component: DeatilUserComponent;
  let fixture: ComponentFixture<DeatilUserComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeatilUserComponent]
    });
    fixture = TestBed.createComponent(DeatilUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

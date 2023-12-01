import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NvUserComponent } from './nv-user.component';

describe('NvUserComponent', () => {
  let component: NvUserComponent;
  let fixture: ComponentFixture<NvUserComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NvUserComponent]
    });
    fixture = TestBed.createComponent(NvUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

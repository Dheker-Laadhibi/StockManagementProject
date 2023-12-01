import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NvCliComponent } from './nv-cli.component';

describe('NvCliComponent', () => {
  let component: NvCliComponent;
  let fixture: ComponentFixture<NvCliComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NvCliComponent]
    });
    fixture = TestBed.createComponent(NvCliComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

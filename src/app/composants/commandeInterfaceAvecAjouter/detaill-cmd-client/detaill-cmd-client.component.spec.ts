import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetaillCmdClientComponent } from './detaill-cmd-client.component';

describe('DetaillCmdClientComponent', () => {
  let component: DetaillCmdClientComponent;
  let fixture: ComponentFixture<DetaillCmdClientComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DetaillCmdClientComponent]
    });
    fixture = TestBed.createComponent(DetaillCmdClientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

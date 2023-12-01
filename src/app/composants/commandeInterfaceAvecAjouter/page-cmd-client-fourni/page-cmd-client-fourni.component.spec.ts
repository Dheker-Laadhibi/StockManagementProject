import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageCmdClientFourniComponent } from './page-cmd-client-fourni.component';

describe('PageCmdClientFourniComponent', () => {
  let component: PageCmdClientFourniComponent;
  let fixture: ComponentFixture<PageCmdClientFourniComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PageCmdClientFourniComponent]
    });
    fixture = TestBed.createComponent(PageCmdClientFourniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

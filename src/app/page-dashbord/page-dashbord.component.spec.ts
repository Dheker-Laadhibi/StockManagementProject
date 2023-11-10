import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageDashbordComponent } from './page-dashbord.component';

describe('PageDashbordComponent', () => {
  let component: PageDashbordComponent;
  let fixture: ComponentFixture<PageDashbordComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PageDashbordComponent]
    });
    fixture = TestBed.createComponent(PageDashbordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

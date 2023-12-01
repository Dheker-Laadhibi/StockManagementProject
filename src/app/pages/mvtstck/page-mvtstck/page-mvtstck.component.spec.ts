import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageMvtstckComponent } from './page-mvtstck.component';

describe('PageMvtstckComponent', () => {
  let component: PageMvtstckComponent;
  let fixture: ComponentFixture<PageMvtstckComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PageMvtstckComponent]
    });
    fixture = TestBed.createComponent(PageMvtstckComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

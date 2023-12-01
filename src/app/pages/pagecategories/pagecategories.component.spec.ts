import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PagecategoriesComponent } from './pagecategories.component';

describe('PagecategoriesComponent', () => {
  let component: PagecategoriesComponent;
  let fixture: ComponentFixture<PagecategoriesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PagecategoriesComponent]
    });
    fixture = TestBed.createComponent(PagecategoriesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvelleCategorieComponent } from './nouvelle-categorie.component';

describe('NouvelleCategorieComponent', () => {
  let component: NouvelleCategorieComponent;
  let fixture: ComponentFixture<NouvelleCategorieComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NouvelleCategorieComponent]
    });
    fixture = TestBed.createComponent(NouvelleCategorieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

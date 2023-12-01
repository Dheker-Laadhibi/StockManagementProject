import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageFournisseurComponent } from './page-fournisseur.component';

describe('PageFournisseurComponent', () => {
  let component: PageFournisseurComponent;
  let fixture: ComponentFixture<PageFournisseurComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PageFournisseurComponent]
    });
    fixture = TestBed.createComponent(PageFournisseurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

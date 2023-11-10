import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageInscriptionComponent } from './page-inscription.component';

describe('PageInscriptionComponent', () => {
  let component: PageInscriptionComponent;
  let fixture: ComponentFixture<PageInscriptionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PageInscriptionComponent]
    });
    fixture = TestBed.createComponent(PageInscriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvelleCommandeCliComponent } from './nouvelle-commande-cli.component';

describe('NouvelleCommandeCliComponent', () => {
  let component: NouvelleCommandeCliComponent;
  let fixture: ComponentFixture<NouvelleCommandeCliComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NouvelleCommandeCliComponent]
    });
    fixture = TestBed.createComponent(NouvelleCommandeCliComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

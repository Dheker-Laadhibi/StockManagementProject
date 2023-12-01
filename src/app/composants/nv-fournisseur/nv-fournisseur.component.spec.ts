import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NvFournisseurComponent } from './nv-fournisseur.component';

describe('NvFournisseurComponent', () => {
  let component: NvFournisseurComponent;
  let fixture: ComponentFixture<NvFournisseurComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NvFournisseurComponent]
    });
    fixture = TestBed.createComponent(NvFournisseurComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

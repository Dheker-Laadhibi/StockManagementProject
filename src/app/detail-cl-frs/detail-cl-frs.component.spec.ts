import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailClFrsComponent } from './detail-cl-frs.component';

describe('DetailClFrsComponent', () => {
  let component: DetailClFrsComponent;
  let fixture: ComponentFixture<DetailClFrsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DetailClFrsComponent]
    });
    fixture = TestBed.createComponent(DetailClFrsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

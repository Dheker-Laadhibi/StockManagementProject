import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailleMvtArticleComponent } from './detaille-mvt-article.component';

describe('DetailleMvtArticleComponent', () => {
  let component: DetailleMvtArticleComponent;
  let fixture: ComponentFixture<DetailleMvtArticleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DetailleMvtArticleComponent]
    });
    fixture = TestBed.createComponent(DetailleMvtArticleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

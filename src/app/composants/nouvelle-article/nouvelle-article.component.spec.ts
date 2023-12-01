import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NouvelleArticleComponent } from './nouvelle-article.component';

describe('NouvelleArticleComponent', () => {
  let component: NouvelleArticleComponent;
  let fixture: ComponentFixture<NouvelleArticleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NouvelleArticleComponent]
    });
    fixture = TestBed.createComponent(NouvelleArticleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

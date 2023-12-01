import { article } from './../../modeles/article';
import { ArticleService } from 'src/app/services/article.service';
import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/modeles/category';

@Component({
  selector: 'app-detail-article',
  templateUrl: './detail-article.component.html',
  styleUrls: ['./detail-article.component.scss']
})
export class DetailArticleComponent implements OnInit {
  @Input()
  articleName :any;
  @Input() article: any;
 

 
  
  constructor(private router: Router,private ArticleService:ArticleService
  ) { }


  ngOnInit(): void {

console.log(
  this.article);


  }

  



  
}

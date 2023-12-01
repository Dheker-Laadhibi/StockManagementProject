import { Router } from '@angular/router';
import { Component, Input, OnInit } from '@angular/core';
import { ArticleService } from 'src/app/services/article.service';
import { article } from 'src/app/modeles/article';
import { Category } from 'src/app/modeles/category';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.scss']
})
export class ArticleComponent implements OnInit {
  /* action sur le button nv article */ 
  articlesList  : article[] = [];

nouveauArticle() {
this.router.navigate(['newArticle']);
}



 
 

  ngOnInit(): void {
  this.findAllArticles ();
  }

  constructor(private router : Router,private ArticleService:ArticleService){
  }
  
findAllArticles():void{
this.ArticleService.getArticles().subscribe(
  data =>{this.articlesList= data;
    console.log(this.articlesList);
    console.log('Données reçues :', data)


  }, error => {
    console.error('Erreur lors de la récupération des articles', error);
  }
)

}





}



































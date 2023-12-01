import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { CategorieService } from './../../services/categorie.service';
import { Category } from './../../modeles/category';
import { ArticleService } from 'src/app/services/article.service';
import { article } from 'src/app/modeles/article';

@Component({
  selector: 'app-nouvelle-article',
  templateUrl: './nouvelle-article.component.html',
  styleUrls: ['./nouvelle-article.component.scss']
})
export class NouvelleArticleComponent implements OnInit {
  categories: Category[] = [];
  nouvelArticle: article = {
    category: {} as Category
  };

  constructor(
    private router: Router,
    private CategorieService: CategorieService,
    private ArticleService: ArticleService
  ) {}

  save(form: NgForm) {
    this.ajouterArticle(form);
    this.router.navigate(['articles']);
    alert('Article ajouté avec succès !');
  }

  ngOnInit(): void {
    this.loadCategories();
  }

  ajouterArticle(form: NgForm) {
    if (this.nouvelArticle.category?.idcategorie !== undefined) {
      this.ArticleService.AjouterArticleDepuisForm(this.nouvelArticle, this.nouvelArticle.category.idcategorie).subscribe(
        response => {
          console.log('Article ajouté avec succès', response);
          this.nouvelArticle = {
            category: {} as Category
          };
        },
        error => {
          console.error('Erreur lors de l\'ajout de l\'article :', error);
        }
      );
    }
  }

  loadCategories() {
    this.CategorieService.getCategories().subscribe(
      data => {
        this.categories = data;
        console.log(this.categories);
      },
      error => {
        console.error('Erreur lors de la récupération des catégories', error);
      }
    );
  }
}

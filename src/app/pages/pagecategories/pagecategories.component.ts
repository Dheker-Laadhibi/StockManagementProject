import { CategorieService } from './../../services/categorie.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app/modeles/category';

@Component({
  selector: 'app-pagecategories',
  templateUrl: './pagecategories.component.html',
  styleUrls: ['./pagecategories.component.scss']
})
export class PagecategoriesComponent implements OnInit {
  categories: any[] = [];
constructor(private router:Router, private CategorieService:CategorieService){

}



  ngOnInit(): void {
this.getCategories();
}



nouvelleCategorie( ) {
this.router.navigate(['nvcategorie']);
}

getCategories():void{
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

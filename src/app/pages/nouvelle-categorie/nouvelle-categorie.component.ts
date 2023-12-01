import { CategorieService } from './../../services/categorie.service';
import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Category } from 'src/app/modeles/category';

@Component({
  selector: 'app-nouvelle-categorie',
  templateUrl: './nouvelle-categorie.component.html',
  styleUrls: ['./nouvelle-categorie.component.scss']
})
export class NouvelleCategorieComponent {

  categorie: Category = {
    codecategorie: '',
    designation: ''
  };
  constructor(
    private router: Router,
    private CategorieService:CategorieService
   
  ) {}
  saveCategory(form: NgForm): void {
    if (form.valid) {
      this.CategorieService.addCategory(this.categorie).subscribe(
        response => {
          console.log('Catégorie ajoutée avec succès!', response);
          // Redirection vers la liste des catégories après ajout
          this.router.navigate(['lisetCategories']);
        },
        error => {
          console.error('Erreur lors de l\'ajout de la catégorie', error);
          // Gérer l'erreur, afficher un message à l'utilisateur, etc.
        }
      );
    } else {
      console.error('Formulaire invalide');
      // Gérer le cas où le formulaire est invalide, afficher un message à l'utilisateur, etc.
    }
  }
}
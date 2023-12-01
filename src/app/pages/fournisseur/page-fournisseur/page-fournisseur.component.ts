import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-page-fournisseur',
  templateUrl: './page-fournisseur.component.html',
  styleUrls: ['./page-fournisseur.component.scss']
})
export class PageFournisseurComponent {

  constructor(private router : Router){
  }
nouveauArticle() {
  this.router.navigate(['nouveauFournisseur']);
}

}

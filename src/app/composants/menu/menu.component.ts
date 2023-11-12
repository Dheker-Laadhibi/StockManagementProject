import { Component, OnInit } from '@angular/core';
import { menu } from './menu';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
//create menu objectes  menu prop 
public menuProperties : Array<menu> = [
  {
id:'1',
titre:'Tableau de bord',
icon:'',

url:'',
sousMenu:[
  {
    id:'11',
    titre:'vue d\'ensemble',
    icon:'',
    url:'',

  },
  {
    id:'12',
    titre:'statistiques',
    icon:'',
    url:'',

  }
]
},
//second object of menu is article 

{
  id:'2',
  titre:'articles',
  icon:'',
  url:'',
// sub menu of article 
  sousMenu:[
    {
      id:'21',
      titre:'articles ',
      icon:'',
      url:'',
  
    },
    {
      id:'22',
      titre:'mouvement de stock',
      icon:'',
      url:'',
  
    }

  ]

},
// third object of menu  which is customer
{
  id:'3',
  titre:'clients',
  icon:'',
  url:'',
// sub menu of client 
  sousMenu:[
    {
      id:'31',
      titre:'clients  ',
      icon:'',
      url:'',
  
    },
    {
      id:'32',
      titre:'commande clients ',
      icon:'',
      url:'',
  
    }

  ]

},
// fourth object of menu is fournisseur /supplier

{
  id:'4',
  titre:'fournisseur',
  icon:'',
  url:'',
// sub menu of fournisseur
  sousMenu:[
    {
      id:'41',
      titre:'Fournisseurs  ',
      icon:'',
      url:'',
  
    },
    {
      id:'42',
      titre:'Commande Fournisseurs ',
      icon:'',
      url:'',
  
    }

  ]

},
//  the  last obj is settings 
{
  id:'5',
  titre:'Parametrages',
  icon:'',
  url:'',
// sub menu of settings
  sousMenu:[
    {
      id:'51',
      titre:'Categories  ',
      icon:'',
      url:'',
  
    },
    {
      id:'52',
      titre:'Utilisateurs',
      icon:'',
      url:'',
  
    }

  ]

},








]




constructor(){

}


  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }





}

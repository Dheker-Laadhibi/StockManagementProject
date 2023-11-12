import { Component, OnInit } from '@angular/core';
import { menu } from './menu';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {




  //accordion 
  panelExpanded = true;
//create menu objectes  menu prop 
public menuProperties : Array<menu> = [
  {
id:'1',
titre:'Tableau de bord',
icon:'<i class="fas fa-chart-line"></i>',

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
    url:'statistique1',

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
  url:'https://example.com?svg=<svg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20width%3D%2216%22%20height%3D%2216%22%20fill%3D%22currentColor%22%20class%3D%22bi%20bi-tools%22%20viewBox%3D%220%200%2016%2016%22%3E%3Cpath%20d%3D%22M1%200%200%201l2.2%203.081a1%201%200%200%200%20.815.419h.07a1%201%200%200%201%20.708.293l2.675%202.675-2.617%202.654A3.003%203.003%200%200%200%200%2013a3%203%200%201%200%205.878-.851l2.654-2.617.968.968-.305.914a1%201%200%200%200%20.242%201.023l3.27%203.27a.997.997%200%200%200%201.414%200l1.586-1.586a.997.997%200%200%200%200-1.414l-3.27-3.27a1%201%200%200%200-1.023-.242L10.5%209.5l-.96-.96%202.68-2.643A3.005%203.005%200%200%200%2016%203c0-.269-.035-.53-.102-.777l-2.14%202.141L12%204l-.364-1.757L13.777.102a3%203%200%200%200-3.675%203.68L7.462%206.46%204.793%203.793a1%201%200%200%201-.293-.707v-.071a1%201%200%200%200-.419-.814L1%200Zm9.646%2010.646a.5.5%200%200%201%20.708%200l2.914%202.915a.5.5%200%200%201-.707.707l-2.915-2.914a.5.5%200%200%201%200-.708ZM3%2011l.471.242.529.026.287.445.445.287.026.529L5%2013l-.242.471-.026.529-.445.287-.287.445-.529.026L3%2015l-.471-.242L2%2014.732l-.287-.445L1.268%2014l-.026-.529L1%2013l.242-.471.026-.529.445-.287.287-.445.529-.026L3%2011Z%22%3E%3C%2Fpath%3E%3C%2Fsvg%3E',
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




constructor(private router:Router){

}



  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }


  //methode navigate to navigate between sub menues 


  navigate(url: string): void {
    this.router.navigate([url]);
  }



}

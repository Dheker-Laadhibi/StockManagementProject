import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageLoginComponent } from './pages/page-login/page-login.component';
import { PageInscriptionComponent } from './page-inscription/page-inscription.component';
import { PageDashbordComponent } from './page-dashbord/page-dashbord.component';
import { PageStatistiquesComponent } from './page-statistiques/page-statistiques.component';

const routes: Routes = [

{
  path:'login',
component:PageLoginComponent

},{
path:'inscrire',
component:PageInscriptionComponent

}

,{
  path:'',
  component:PageDashbordComponent,
  children:[

{
  path :'statistique1',
  component:PageStatistiquesComponent
}

  ]
  
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

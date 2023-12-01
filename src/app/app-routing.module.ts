import { PageCmdClientFourniComponent } from './composants/commandeInterfaceAvecAjouter/page-cmd-client-fourni/page-cmd-client-fourni.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageLoginComponent } from './pages/page-login/page-login.component';
import { PageInscriptionComponent } from './page-inscription/page-inscription.component';
import { PageDashbordComponent } from './page-dashbord/page-dashbord.component';
import { PageStatistiquesComponent } from './page-statistiques/page-statistiques.component';
import { ArticleComponent } from './composants/article/article.component';
import { NouvelleArticleComponent } from './composants/nouvelle-article/nouvelle-article.component';
import { PageMvtstckComponent } from './pages/mvtstck/page-mvtstck/page-mvtstck.component';

import { PageFournisseurComponent } from './pages/fournisseur/page-fournisseur/page-fournisseur.component';
import { NvCliComponent } from './composants/nv-cli/nv-cli.component';
import { NvFournisseurComponent } from './composants/nv-fournisseur/nv-fournisseur.component';
import { ClientsComponent } from './pages/clients/clients.component';
import { NouvelleCommandeCliComponent } from './composants/commandeInterfaceAvecAjouter/nouvelle-commande-cli/nouvelle-commande-cli.component';
import { PagecategoriesComponent } from './pages/pagecategories/pagecategories.component';
import { NouvelleCategorieComponent } from './pages/nouvelle-categorie/nouvelle-categorie.component';
import { PageUsersComponent } from './page-users/page-users.component';
import { NvUserComponent } from './nv-user/nv-user.component';

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
},{
  path :'articles',
  component :ArticleComponent
},
{
  path :'newArticle',
  component :NouvelleArticleComponent
},

{
  path :'mvt',
  component :PageMvtstckComponent
},
{
  path :'clients',
  component :ClientsComponent
},
{
  path :'fourni',
  component :PageFournisseurComponent
},
{
  path :'nouveauClient',
  component :NvCliComponent
},
{
  path :'nouveauFournisseur',
  component :NvFournisseurComponent
}
,{
  path :'CommandeClient',
  component :PageCmdClientFourniComponent
},{
  path :'nouvelleCommande',
  component :NouvelleCommandeCliComponent
}
,{
  path :'commandeFournisseur',
  component :PageCmdClientFourniComponent
},{
  path :'lisetCategories',
  component :PagecategoriesComponent
},{
  path :'nvcategorie',
  component :NouvelleCategorieComponent
},{
  path :'ListeUsers',
  component :PageUsersComponent
}
,{
  path :'nvUser',
  component :NvUserComponent
}



  ]
  
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageLoginComponent } from './pages/page-login/page-login.component';
import { PageInscriptionComponent } from './page-inscription/page-inscription.component';
import { PageDashbordComponent } from './page-dashbord/page-dashbord.component';
import { PageStatistiquesComponent } from './page-statistiques/page-statistiques.component';
import { MenuComponent } from './composants/menu/menu.component';
import { HeaderComponent } from './composants/header/header.component';
import { ArticleComponent } from './composants/article/article.component';
import { DetailArticleComponent } from './composants/detail-article/detail-article.component';
import { NouvelleArticleComponent } from './composants/nouvelle-article/nouvelle-article.component';
import { PaginationComponent } from './composants/pagination/pagination.component';
import { ButtonsComponent } from './buttons/buttons.component';
import { PageMvtstckComponent } from './pages/mvtstck/page-mvtstck/page-mvtstck.component';
import { DetailleMvtArticleComponent } from './composants/detaille-mvt-article/detaille-mvt-article.component';
import { DetailMvtStkComponent } from './composants/detail-mvt-stk/detail-mvt-stk.component';
import { DetailClFrsComponent } from './detail-cl-frs/detail-cl-frs.component';

import { PageFournisseurComponent } from './pages/fournisseur/page-fournisseur/page-fournisseur.component';
import { NvCliComponent } from './composants/nv-cli/nv-cli.component';
import { NvFournisseurComponent } from './composants/nv-fournisseur/nv-fournisseur.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DetaillCmdClientComponent } from './composants/commandeInterfaceAvecAjouter/detaill-cmd-client/detaill-cmd-client.component';
import { ClientsComponent } from './pages/clients/clients.component';
import { PageCmdClientFourniComponent } from './composants/commandeInterfaceAvecAjouter/page-cmd-client-fourni/page-cmd-client-fourni.component';
import { DetailCmdComponent } from './composants/detail-cmd/detail-cmd.component';
import { NouvelleCommandeCliComponent } from './composants/commandeInterfaceAvecAjouter/nouvelle-commande-cli/nouvelle-commande-cli.component';
import { PagecategoriesComponent } from './pages/pagecategories/pagecategories.component';
import { NouvelleCategorieComponent } from './pages/nouvelle-categorie/nouvelle-categorie.component';
import { PageUsersComponent } from './page-users/page-users.component';
import { DeatilUserComponent } from './deatil-user/deatil-user.component';
import { NvUserComponent } from './nv-user/nv-user.component';






@NgModule({
  declarations: [
    AppComponent,
    PageLoginComponent,
    PageInscriptionComponent,
    PageDashbordComponent,
    PageStatistiquesComponent,
    MenuComponent,
    HeaderComponent,
    ArticleComponent,
    DetailArticleComponent,
    NouvelleArticleComponent,
    PaginationComponent,
    ButtonsComponent,
    PageMvtstckComponent,
    DetailleMvtArticleComponent,
    DetailMvtStkComponent,
    DetailClFrsComponent,

    PageFournisseurComponent,
    NvCliComponent,
    NvFournisseurComponent,
    DetaillCmdClientComponent,
    ClientsComponent,
    PageCmdClientFourniComponent,
    DetailCmdComponent,
    NouvelleCommandeCliComponent,
    PagecategoriesComponent,
    NouvelleCategorieComponent,
    PageUsersComponent,
    DeatilUserComponent,
    NvUserComponent,
    
  
   

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
   
    
 
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

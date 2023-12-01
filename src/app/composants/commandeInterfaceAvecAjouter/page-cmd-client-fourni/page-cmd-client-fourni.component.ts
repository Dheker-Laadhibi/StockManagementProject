import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-page-cmd-client-fourni',
  templateUrl: './page-cmd-client-fourni.component.html',
  styleUrls: ['./page-cmd-client-fourni.component.scss']
})
export class PageCmdClientFourniComponent {
  constructor(private router : Router){

  }
nouvelleCommande() {
this.router.navigate(['nouvelleCommande'])
}

}

import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-page-users',
  templateUrl: './page-users.component.html',
  styleUrls: ['./page-users.component.scss']
})
export class PageUsersComponent {
  constructor(private router:Router) {
    
  }
nouveauUser() {
this.router.navigate(['nvUser']);
}

}

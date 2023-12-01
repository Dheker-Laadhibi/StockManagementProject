import { Component,EventEmitter, OnInit,Output, } from '@angular/core';

@Component({
  selector: 'app-buttons',
  templateUrl: './buttons.component.html',
  styleUrls: ['./buttons.component.scss']
})
export class ButtonsComponent implements OnInit {
  
  @Output() clickEvent = new EventEmitter();
  ngOnInit(): void {
   
  }
  buttonNouveauClick(){
this.clickEvent.emit();
  }

}

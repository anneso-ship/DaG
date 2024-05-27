import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-panel',
  templateUrl: './user-panel.component.html',
  styleUrls: ['./user-panel.component.scss']
})
export class UserPanelComponent implements OnInit {

  activeComponent: string = 'birthCertificateDisplay'; // Composant par défaut
  
  constructor() { }

  ngOnInit(): void {
  }

}

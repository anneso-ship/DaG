import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-panel-administrator',
  templateUrl: './panel-administrator.component.html',
  styleUrls: ['./panel-administrator.component.scss']
})
export class PanelAdministratorComponent implements OnInit {

  activeComponent: string = 'agent-info-list'; // Composant par défaut



  constructor() { }

  ngOnInit(): void {
  }


}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-agent-panel',
  templateUrl: './agent-panel.component.html',
  styleUrls: ['./agent-panel.component.scss']
})
export class AgentPanelComponent implements OnInit {

  activeComponent: string = 'birthCertificateDisplay'; // Composant par défaut

  constructor() { }

  ngOnInit(): void {
  }

}

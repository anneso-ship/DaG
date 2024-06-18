import { Component, OnInit } from '@angular/core';
import { AgentService } from '../services/agent.service';
import { UserService } from '../services/user.service';
import { ProcedureService } from '../services/procedure.service';

@Component({
  selector: 'app-analytics',
  templateUrl: './analytics.component.html',
  styleUrls: ['./analytics.component.scss']
})
export class AnalyticsComponent implements OnInit {

  totalAgents: number;
  totalUsers: number;
  totalProcedures: number;
  totalProcedures_en_attente: number;
  totalProcedures_en_cours: number;
  totalProcedures_terminee: number;
  totalProcedures_rejetee:number;
  totalProcedures_assigned: number;
  totalProcedures_unassigned: number;  

  constructor(private agentService: AgentService,
    private userService: UserService,
    private procedureService: ProcedureService) { }

  ngOnInit(): void {
    this.getTotalAgents();
    this.getTotalUsers();
    this.getTotalProcess();
    this.getTotalProcess_EN_ATTENTE();
    this.getTotalProcess_EN_COURS();
    this.getTotalProcess_TERMINEE();
    this.getTotalProcess_REJETEE();
    this.getTotalProcess_ASSIGNED();
    this.getTotalProcess_UNASSIGNED();
  }

  getTotalAgents(): void {
    this.agentService.getTotalAgents().subscribe(
      (data: number) => this.totalAgents = data,
      error => console.error('There was an error!', error)
    );
  }

  getTotalUsers(): void {
    this.userService.getTotalUsers().subscribe(
      (data: number) => this.totalUsers = data,
      error => console.error('There was an error fetching total users!', error)
    );
  }

  getTotalProcess(): void {
    this.procedureService.getTotalProcedures().subscribe(
      (data: number) => this.totalProcedures = data,
      error => console.error('There was an error fetching total procedures!', error)
    );
  }

  getTotalProcess_EN_ATTENTE(): void {
    this.procedureService.getTotalProcedures_En_attente().subscribe(
      (data: number) => this.totalProcedures_en_attente = data,
      error => console.error('There was an error fetching total procedures!', error)
    );
  }

  getTotalProcess_EN_COURS(): void {
    this.procedureService.getTotalProcedures_En_cours().subscribe(
      (data: number) => this.totalProcedures_en_cours = data,
      error => console.error('There was an error fetching total procedures!', error)
    );
  }

  getTotalProcess_TERMINEE(): void {
    this.procedureService.getTotalProcedures_Terminee().subscribe(
      (data: number) => this.totalProcedures_terminee = data,
      error => console.error('There was an error fetching total termintated procedures!', error)
    );
  }

  getTotalProcess_REJETEE(): void {
    this.procedureService.getTotalProcedures_Rejetee().subscribe(
      (data: number) => this.totalProcedures_rejetee = data,
      error => console.error('There was an error fetching total rejected procedures!', error)
    );
  }

  getTotalProcess_ASSIGNED(): void {
    this.procedureService.getTotalProcedures_Assignee().subscribe(
      (data: number) => this.totalProcedures_assigned = data,
      error => console.error('There was an error fetching total assigned procedures!', error)
    );
  }

  getTotalProcess_UNASSIGNED(): void {
    this.procedureService.getTotalProcedures_UnAssigned().subscribe(
      (data: number) => this.totalProcedures_unassigned = data,
      error => console.error('There was an error fetching total unassigned procedures!', error)
    );
  }

}

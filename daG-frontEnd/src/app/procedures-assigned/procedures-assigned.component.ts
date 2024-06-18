import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import { AgentService } from '../services/agent.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Observable } from 'rxjs';
import { ProcedureService } from '../services/procedure.service';
import { Procedure } from '../model/procedure';

@Component({
  selector: 'app-procedures-assigned',
  templateUrl: './procedures-assigned.component.html',
  styleUrls: ['./procedures-assigned.component.scss']
})
export class ProceduresAssignedComponent implements OnInit {


  assignForm: FormGroup;
  agents$: Observable<any[]>;
  procedures$: Observable<any[]>;
  assignedAgents: any[] = [];

 

  constructor(
    private agentService: AgentService,
    private procedureService: ProcedureService,
    private fb: FormBuilder
  ) {
    this.assignForm = this.fb.group({
      procedure: ['', Validators.required],
      agent: ['', Validators.required]
    });
  }

  ngOnInit(): void {
    this.loadAgents();
    this.loadProcedures();
  }

  loadAgents() {
    this.agents$ = this.agentService.getAllAgent();
    this.agentService.getAllAgent().subscribe(agents => {
      this.assignedAgents = [];
      agents.forEach(agent => {
        if (agent.proceduresAssignees && agent.proceduresAssignees.length > 0) {
          agent.proceduresAssignees.forEach(procedure => {
            this.assignedAgents.push({
              agent: {
                name: agent.name,
                firstName: agent.firstName
              },
              procedure: {
                id: procedure.id,             // Ajout de l'id
                code: procedure.code,         // Ajout du code
                type: procedure.type,
                dateDemande: procedure.dateDemande,
                dateAssignation: procedure.dateAssignation
              }
            });
          });
        }
      });
      console.log('Assigned Agents:', this.assignedAgents);
    });
  }

  loadProcedures() {
    this.procedures$ = this.procedureService.getAllProcedures();
  }

  onSubmit(): void {
    if (this.assignForm.valid) {
      const procedureId = this.assignForm.get('procedure')?.value;
      const agentId = this.assignForm.get('agent')?.value;
      this.agentService.assignProcessToAgent(agentId, procedureId).subscribe(
        response => {
          console.log('Assignation réussie:', response);
          // Recharger les agents après une assignation réussie
          this.loadAgents();
           
        },
        error => {
          console.error('Erreur lors de l\'assignation:', error);
        }
      );
    } else {
      console.error('Formulaire invalide');
    }
    // Recharger la page après une assignation réussie
    window.location.reload();
  }





}

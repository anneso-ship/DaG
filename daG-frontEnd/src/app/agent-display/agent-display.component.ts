import { Component, OnInit ,Input, ElementRef, ViewChild} from '@angular/core';
import { Agent } from '../model/agent.model';
import { AgentService } from '../services/agent.service';

import { Router } from '@angular/router';

import { BehaviorSubject, Observable, combineLatest, of } from 'rxjs';
import { map, filter} from 'rxjs/operators';
import { FormControl, FormBuilder } from '@angular/forms';



@Component({
  selector: 'app-agent-display',
  templateUrl: './agent-display.component.html',
  styleUrls: ['./agent-display.component.scss']
})
export class AgentDisplayComponent implements OnInit {

    @Input()
    public agents: Agent[] = [];

    selectedAgent: Agent | null = null;

    agent$! : Observable<Agent[]>;

    @ViewChild('agentDetails') agentDetails!: ElementRef;


  constructor(private agentService: AgentService) { }

  ngOnInit(): void {
        this.agent$=this.agentService.getAllAgent();

  }

  onViewAgent(agent: Agent): void {
    this.selectedAgent = agent;
    setTimeout(() => {
      this.agentDetails.nativeElement.scrollIntoView({ behavior: 'smooth', block: 'start' });
  }, 0);
  }

  onBack(): void {
    this.selectedAgent = null;
  }


}

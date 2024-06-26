import { Component, OnInit ,Input, ElementRef, ViewChild} from '@angular/core';
import { Agent } from '../model/agent.model';
import { AgentService } from '../services/agent.service';
import { Observable} from 'rxjs';
import { map } from 'rxjs/operators';



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

    searchTerm: string = '';


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

  //Filtrage dans la barre de recherche en fonction du nom et du prénom
  applyFilter(): void {
    this.agent$ = this.agentService.getAllAgent().pipe(
      map(agents => agents.filter(agent =>
        agent.name.toLowerCase().includes(this.searchTerm.toLowerCase()) ||
        agent.firstName.toLowerCase().includes(this.searchTerm.toLowerCase()) ||
        (agent.proceduresAssignees && agent.proceduresAssignees.some(procedure =>
          procedure.code.toLowerCase().includes(this.searchTerm.toLowerCase())
        ))
      ))
    );
  }


}

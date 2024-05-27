import { Component, OnInit , Input , ViewChild, ElementRef} from '@angular/core';
import { Procedure } from '../model/procedure';
import { Observable} from 'rxjs';
import { ProcedureService } from '../services/procedure.service';

@Component({
  selector: 'app-procedures-list',
  templateUrl: './procedures-list.component.html',
  styleUrls: ['./procedures-list.component.scss']
})
export class ProceduresListComponent implements OnInit {

  @Input()
  public procedures: Procedure[] = [];

  @ViewChild('procedureDetails') agentDetails!: ElementRef;

  selectedProcedure: Procedure | null = null;

  procedure$! : Observable<Procedure[]>;

  

      constructor(private procedureService: ProcedureService) { }

      ngOnInit(): void {
        this.procedure$=this.procedureService.getAllProcedures();
      }

      onViewProcedure(procedure: Procedure): void {
        this.selectedProcedure = procedure;
        setTimeout(() => {
          this.agentDetails.nativeElement.scrollIntoView({ behavior: 'smooth', block: 'start' });
      }, 0);
      }

      onBack(): void {
        this.selectedProcedure = null;
      }


}

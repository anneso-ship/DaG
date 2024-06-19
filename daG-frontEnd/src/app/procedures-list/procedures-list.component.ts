import { Component, OnInit , Input , ViewChild, ElementRef} from '@angular/core';
import { Procedure } from '../model/procedure';
import { Observable} from 'rxjs';
import { ProcedureService } from '../services/procedure.service';
import { map } from 'rxjs/operators';

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

  searchTerm: string = '';

  

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

     
      applyFilter(): void {
        this.procedure$ = this.procedureService.getAllProcedures().pipe(
          map((procedures: Procedure[]) => procedures.filter(procedure =>
            procedure.code.toLowerCase().includes(this.searchTerm.toLowerCase()) ||
            procedure.status.toLowerCase().includes(this.searchTerm.toLowerCase())
          ))
        );
      }

}

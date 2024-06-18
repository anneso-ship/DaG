import { Injectable } from '@angular/core';
import { Procedure } from '../model/procedure';
import { Observable} from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProcedureService {

  constructor(private http: HttpClient) { }

  //RECUPERER TOUS LES ACTES DE NAISSANCES ENREGISTRES
    getAllProcedures(): Observable<Procedure[]> {
         return this.http.get<Procedure[]>('http://localhost:8080/procedures/get_all_process_details');
    }

    //RECUPERER LE NOMBRE TOTAL DE PROCEDURE
    getTotalProcedures(): Observable<number> {
      return this.http.get<number>('http://localhost:8080/procedures/count');
    }

    //RECUPERER LE NOMBRE TOTAL DE PROCEDURE EN ATTENTE
    getTotalProcedures_En_attente(): Observable<number> {
      return this.http.get<number>('http://localhost:8080/procedures/count/en_attente');
    }

    //RECUPERER LE NOMBRE TOTAL DE PROCEDURE EN COURS
    getTotalProcedures_En_cours(): Observable<number> {
      return this.http.get<number>('http://localhost:8080/procedures/count/en_cours');
    }

    //RECUPERER LE NOMBRE TOTAL DE PROCEDURE  CLOTURER
    getTotalProcedures_Terminee(): Observable<number> {
      return this.http.get<number>('http://localhost:8080/procedures/count/terminee');
    }

    //RECUPERER LE NOMBRE TOTAL DE PROCEDURE  CLOTURER
    getTotalProcedures_Rejetee(): Observable<number> {
      return this.http.get<number>('http://localhost:8080/procedures/count/rejetee');
    }

    //RECUPERER LE NOMBRE TOTAL DE PROCEDURE  ASSIGNEE
    getTotalProcedures_Assignee(): Observable<number> {
      return this.http.get<number>('http://localhost:8080/procedures/count/assigned');
    }

    //RECUPERER LE NOMBRE TOTAL DE PROCEDURE  NON ASSIGNEE
    getTotalProcedures_UnAssigned(): Observable<number> {
      return this.http.get<number>('http://localhost:8080/procedures/count/unassigned');
    }

}

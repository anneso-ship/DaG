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

}

import { Injectable } from '@angular/core';
import { Agent } from '../model/agent.model';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class AgentService {

  constructor(private http: HttpClient) { }

   //RECUPERER TOUS LES ACTES DE NAISSANCES ENREGISTRES
    getAllAgent(): Observable<Agent[]> {
         return this.http.get<Agent[]>('http://localhost:8080/agent/get_agents_details');
    }

    //RECUPERER LE NOMBRE D'AGENT DANS L'APPLICATION
    getTotalAgents(): Observable<number> {
      return this.http.get<number>('http://localhost:8080/agent/count');
    }

    getRequest(): Observable<Agent[]>{
        return this.http.get<Agent[]>('http://localhost:8080/agent/getRequest');
    }

    //ASSIGNATION PROCEDURES A UN AGENT
    assignProcessToAgent(agentId: number, processId: number): Observable<any> {
      return this.http.post(`http://localhost:8080/agent/assignation_agent_to_process/${agentId}/${processId}`, {});
    }

    //CONNEXION AGENT
    loginAgent( email:string,password: string){

        let ConnectiionAgentAttempt = {
             email:email,
             password: password
        }
        console.log(ConnectiionAgentAttempt);
        return this.http.post<any>(`http://localhost:8080/agent/authenticate`,ConnectiionAgentAttempt);
    }

    //AJOUTER UN AGENT
    addAgent( name: string,firstName: string,email:string,
        password: string,phoneNumber:string,role:string){

        let RegisterAgentAttempt = {
            name: name,
            firstName: firstName,
            email:email,
            password: password,
            phoneNumber:phoneNumber,
            role:role
        }
        console.log(RegisterAgentAttempt);
        return this.http.post<any>(`http://localhost:8080/agent/agentRegistration`,RegisterAgentAttempt);
    }

    


}

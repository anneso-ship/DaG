import { User } from './user.model';
import { Agent } from './agent.model';

export class Procedure {
    id?: number;
    type: string;
    description: string;
    dateDemande: Date;
    dateAssignation:Date;
    status: string;
    code: string;
    documentsScannes: string[];
    demandeur: User;
    agent: Agent;
}

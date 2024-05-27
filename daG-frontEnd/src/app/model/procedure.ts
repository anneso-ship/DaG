import { User } from './user.model';
import { Agent } from './agent.model';

export class Procedure {
    id?: number;
    type: string;
    dateDemande: Date;
    status: string;
    documentsScannes: string[];
    demandeur: User;
    agent: Agent;
}

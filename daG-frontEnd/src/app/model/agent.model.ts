import { Procedure } from './procedure';

export class Agent{
    id?:number;
    name:string;
    firstName:string;
    email:string;
    phoneNumber:string;
    password:string;
    role:string;
    departement:string;
    dateEmbauche: Date;
    proceduresAssignees?: Procedure[];
}
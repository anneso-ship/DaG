import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BirthCertificateComponent } from './birth-certificate/birth-certificate.component';
import { HeaderComponent } from './header/header.component';
import { BirthCertificateListComponent } from './birth-certificate-list/birth-certificate-list.component';
import { SingleBirthCertificateComponent } from './single-birth-certificate/single-birth-certificate.component';
import { NewBirthCertificateComponent } from './new-birth-certificate/new-birth-certificate.component';
import { EditBirthCertificateComponent } from './edit-birth-certificate/edit-birth-certificate.component';
import { LoginAdministratorComponent } from './login-administrator/login-administrator.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AgentDisplayComponent } from './agent-display/agent-display.component';
import { UserDisplayComponent } from './user-display/user-display.component';
import { LoginAgentComponent } from './login-agent/login-agent.component';
import { RegisterAdminComponent } from './register-admin/register-admin.component';
import { RegisterAgentComponent } from './register-agent/register-agent.component';
import { ListAgentRequestComponent } from './list-agent-request/list-agent-request.component';
import { PanelAdministratorComponent } from './panel-administrator/panel-administrator.component';
import { AgentPanelComponent } from './agent-panel/agent-panel.component';
import { UserPanelComponent } from './user-panel/user-panel.component';
import { ProceduresListComponent } from './procedures-list/procedures-list.component';

const routes: Routes = [
  {path: '', component:WelcomeComponent},
  {path: 'birthCertificateDisplay', component: BirthCertificateListComponent},
  {path: 'header', component: HeaderComponent},
  {path: 'BirthCertificate/:id', component: SingleBirthCertificateComponent},
  {path: 'BirthCertificate', component: BirthCertificateListComponent},
  {path: 'newBirthCertificate', component:NewBirthCertificateComponent},
  {path: 'editBirthCertificate/:id', component:EditBirthCertificateComponent},
  {path: 'administratorLogin', component:LoginAdministratorComponent},
  {path: 'agent-info-list', component:AgentDisplayComponent},
  {path: 'user-info-list', component:UserDisplayComponent},
  {path: 'officer-login', component:LoginAgentComponent},
  {path: 'register-administrator', component:RegisterAdminComponent},
  {path: 'register-agent', component:RegisterAgentComponent},
  {path: 'requests-agent', component:ListAgentRequestComponent},
  {path: 'Admin-Dashboard', component:PanelAdministratorComponent},
  {path: 'Moderator-Dashboard', component:AgentPanelComponent},
  {path: 'User-Dashboard', component:UserPanelComponent},
  {path:'ProceduresDisplay', component:ProceduresListComponent } 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

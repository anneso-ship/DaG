import {  Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-options',
  templateUrl: './admin-options.component.html',
  styleUrls: ['./admin-options.component.scss']
})
export class AdminOptionsComponent implements OnInit {

  @Output() navigate = new EventEmitter<string>();

  constructor(private router : Router) { }

  ngOnInit(): void {
  }

  onViewAgentInfos() {
    //this.router.navigateByUrl(`/agent-info-list`);
    this.navigate.emit('agent-info-list');
  }

  onViewUserInfos() {
   // this.router.navigateByUrl(`/user-info-list`);
    this.navigate.emit('user-info-list');
  }

}

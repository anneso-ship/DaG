import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import { User } from '../model/user.model';
import { UserService } from '../services/user.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-display',
  templateUrl: './user-display.component.html',
  styleUrls: ['./user-display.component.scss']
})
export class UserDisplayComponent implements OnInit {

     user$! : Observable<User[]>;

     selectedUser: User | null = null;

      selectedPage: string;

      @ViewChild('agentDetails') agentDetails!: ElementRef;

  constructor(private userService: UserService,
  private router : Router) { }

  ngOnInit(): void {
          this.user$=this.userService.getAllUsers();
  }

  onViewUser(user: User): void {
    this.selectedUser = user;
    setTimeout(() => {
      this.agentDetails.nativeElement.scrollIntoView({ behavior: 'smooth', block: 'start' });
  }, 0);
  }

  onBack(): void {
    this.selectedUser = null;
  }




}

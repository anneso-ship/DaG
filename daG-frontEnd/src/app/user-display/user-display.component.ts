import { Component, OnInit, ElementRef, ViewChild, Input } from '@angular/core';
import { User } from '../model/user.model';
import { UserService } from '../services/user.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-user-display',
  templateUrl: './user-display.component.html',
  styleUrls: ['./user-display.component.scss']
})
export class UserDisplayComponent implements OnInit {

  @Input()
  public users: User[] = [];

     user$! : Observable<User[]>;

     selectedUser: User | null = null;

      selectedPage: string;

      @ViewChild('userDetails') userDetails!: ElementRef;

      searchTerm: string = '';

  constructor(private userService: UserService,
  private router : Router) { }

  ngOnInit(): void {
          this.user$=this.userService.getAllUsers();
  }

  onViewUser(user: User): void {
    this.selectedUser = user;
    setTimeout(() => {
      this.userDetails.nativeElement.scrollIntoView({ behavior: 'smooth', block: 'start' });
  }, 0);
  }

  onBack(): void {
    this.selectedUser = null;
  }

  applyFilter(): void {
    this.user$ = this.userService.getAllUsers().pipe(
      map((users: User[]) => users.filter((user: User) =>
        user.name.toLowerCase().includes(this.searchTerm.toLowerCase()) ||
        user.firstName.toLowerCase().includes(this.searchTerm.toLowerCase()) ||
        (user.procedures && user.procedures.some(procedure =>
          procedure.code.toLowerCase().includes(this.searchTerm.toLowerCase())
        ))
      ))
    );
  }



}

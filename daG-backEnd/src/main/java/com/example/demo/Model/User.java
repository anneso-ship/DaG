package com.example.demo.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class User extends UsersModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private char gender;
    Date birthDate;

    public User(){}

    public User(String name, String firstName,
                String email, String phoneNumber,
                String password, String role,
                char gender, Date birthDate) {
        super(name, firstName, email, phoneNumber, password, role);
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}

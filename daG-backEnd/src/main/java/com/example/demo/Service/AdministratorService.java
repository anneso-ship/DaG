package com.example.demo.Service;

import com.example.demo.Model.Administrator;
import com.example.demo.Repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;
@Service
public class AdministratorService {

    @Autowired
    PasswordEncoder encoder;


    @Autowired
    public AdministratorRepository administratorRepository;


    public void createAdmin(Administrator administrator){
        administrator.setPassword(encoder.encode(administrator.getPassword()));
        this.administratorRepository.save(administrator);
    }

    public Administrator loginAdmin(Administrator administrator){
        Optional<Administrator> admin = administratorRepository.findByEmail(administrator.getEmail());
        if (admin.isEmpty()) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
        } else {
            if ( encoder.matches(administrator.getPassword(),admin.get().getPassword())
                    && administrator.getEmail().equals(admin.get().getEmail()) ) {
                return admin.get();
            } else {
                throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
            }
        }
    }

    public List<Administrator> getAllAdministrators() {
        return this.administratorRepository.findAll();
    }


}

package com.example.demo.Controller;


import com.example.demo.Model.Administrator;
import com.example.demo.Model.Agent;
import com.example.demo.Service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("administrator")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    //requete connexion d'un administrateur
    @PostMapping(value = "login")
    public Administrator authenticate(@RequestBody Administrator administrator) {
        return administratorService.loginAdmin(administrator);
    }

    @GetMapping(value= "get_administrators_details")
    public List<Administrator> getAllAdmin(){
        return administratorService.getAllAdministrators();
    }

}

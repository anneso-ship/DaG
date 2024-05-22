package com.example.demo.Configuration;

import com.example.demo.Model.Administrator;
import com.example.demo.Model.Agent;
import com.example.demo.Model.User;
import com.example.demo.Model.UsersType;
import com.example.demo.Repository.AdministratorRepository;
import com.example.demo.Repository.AgentRepository;
import com.example.demo.Repository.BirthCertificateRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.AdministratorService;
import com.example.demo.Service.AgentService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;


@Component
public class InitData implements CommandLineRunner {

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    public AdministratorService administratorService;


    @Autowired
    AgentService agentService;

    public static Random random = new Random();

    @Autowired
    UserService userService;

    @Autowired
    public AdministratorRepository administratorRepository;

    @Autowired
    public AgentRepository agentRepository;

    @Autowired
    public UserRepository userRepository;

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }




    @Override
    public void run(String... args) throws Exception {

    /*        Administrator admin = new Administrator(
                "Bamoni",
                "Anne Sophie",
                "anneSophieBamoni@mairie.fr", // Ajout de l'email manquant
                "07 52 38 95 21",
                encoder.encode("vbyATCNDVTYYvtyvyESEZA"),
                UsersType.ADMINISTRATOR.name(),
                new Date(),
                new Date()
        );

        administratorRepository.save(admin);


        agentRepository.save(new Agent("Mboumba", "Evelyne", "evelyneMboumba@mairie.fr", "06 79 78 45", encoder.encode("agent1"), UsersType.MODERATOR.name(), "Département 1", new Date()));
        agentRepository.save(new Agent("Ndouna", "Christophe", "ndouna@mairie.fr", "06 89 99 99", encoder.encode("agent2"), UsersType.MODERATOR.name(), "Département 2", new Date()));
        agentRepository.save(new Agent("Lendoye", "Carle Hugo", "lendoyeCarle@hotmail.fr", "07 99 00 45", encoder.encode("agent3"), UsersType.MODERATOR.name(), "Département 3", new Date()));
        agentRepository.save(new Agent("Mezui", "Elsa", "elsaMezui@mairie.fr", "07 99 99 99", encoder.encode("agent4"), UsersType.MODERATOR.name(), "Département 4", new Date()));
        */

    }

}

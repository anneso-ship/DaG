package com.example.demo.Configuration;

import com.example.demo.Model.*;
import com.example.demo.Repository.*;
import com.example.demo.Service.AdministratorService;
import com.example.demo.Service.AgentService;
import com.example.demo.Service.ProcedureService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Component
public class InitData implements CommandLineRunner {

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    public AdministratorService administratorService;

    @Autowired
    public ProcedureService procedureService;

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

    @Autowired
    public BirthCertificateRepository birthCertificateRepository;

    @Autowired
    public ProcedureRepository procedureRepository;

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }


    @Override
    public void run(String... args) throws Exception {


    }

}

package com.medev.microservice_app;

import com.medev.microservice_app.Entity.Compte;
import com.medev.microservice_app.enums.AccountType;
import com.medev.microservice_app.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class MicroserviceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAppApplication.class, args);
    }

    /*
    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            for(int i = 0 ; i < 10 ; i++){
             Compte compte = Compte.builder().
                     id(UUID.randomUUID().toString())
                     .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                     .balance(10000+Math.random()*90000)
                     .createAt(new Date())
                     .currency("MAD")
                     .build();

             compteRepository.save(compte);

            }
        };
    }*/
}

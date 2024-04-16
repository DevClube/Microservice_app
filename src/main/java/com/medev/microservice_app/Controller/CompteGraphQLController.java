package com.medev.microservice_app.Controller;


import com.medev.microservice_app.Entity.Compte;
import com.medev.microservice_app.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CompteGraphQLController {

    @Autowired
    private CompteRepository compteRepository;

    @QueryMapping
    public List<Compte> comptesList(){
        return compteRepository.findAll();
    }

    @QueryMapping
    public Compte compteById(@Argument String id) {
        return compteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(String.format("Compte with id %s not found", id)));
    }


}

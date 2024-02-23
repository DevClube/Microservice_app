package com.medev.microservice_app.repository;

import com.medev.microservice_app.Entity.Compte;
import com.medev.microservice_app.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, String> {


    @RestResource(path = "/bytype")
    List<Compte> findByType(@Param("t") AccountType type);
    List<Compte> findByCurrency(String currency);
}

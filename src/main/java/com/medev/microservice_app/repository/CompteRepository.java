package com.medev.microservice_app.repository;

import com.medev.microservice_app.Entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {
}

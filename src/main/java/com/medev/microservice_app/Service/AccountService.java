package com.medev.microservice_app.Service;

import com.medev.microservice_app.DTO.CompteRequestDTO;
import com.medev.microservice_app.DTO.CompteResponseDTO;
import com.medev.microservice_app.Entity.Compte;

public interface AccountService  {

    CompteResponseDTO addCompte(CompteRequestDTO compteDTO);
}

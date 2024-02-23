package com.medev.microservice_app.Mapper;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.medev.microservice_app.DTO.CompteResponseDTO;
import com.medev.microservice_app.Entity.Compte;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public CompteResponseDTO fromCompte(Compte compte){

        CompteResponseDTO compteResponseDTO = new CompteResponseDTO();
        BeanUtils.copyProperties(compte,compteResponseDTO);

        return compteResponseDTO;
    }
}

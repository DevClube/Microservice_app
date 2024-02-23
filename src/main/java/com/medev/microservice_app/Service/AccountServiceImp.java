package com.medev.microservice_app.Service;

import com.medev.microservice_app.DTO.CompteRequestDTO;
import com.medev.microservice_app.DTO.CompteResponseDTO;
import com.medev.microservice_app.Entity.Compte;
import com.medev.microservice_app.Mapper.AccountMapper;
import com.medev.microservice_app.enums.AccountType;
import com.medev.microservice_app.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImp implements AccountService{

    @Autowired
    private CompteRepository compteRepository;

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public CompteResponseDTO addCompte(CompteRequestDTO compteDTO) {

        Compte compte=Compte.builder()
                .id(UUID.randomUUID().toString())
                .type(compteDTO.getType())
                .balance(compteDTO.getBalance())
                .createAt(new Date())
                .currency(compteDTO.getCurrency())
                .build();

        Compte savecompte= compteRepository.save(compte);
        CompteResponseDTO compteResponseDTO = accountMapper.fromCompte(savecompte);


        return compteResponseDTO;
    }









}

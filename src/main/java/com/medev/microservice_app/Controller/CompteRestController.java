package com.medev.microservice_app.Controller;


import com.medev.microservice_app.DTO.CompteRequestDTO;
import com.medev.microservice_app.DTO.CompteResponseDTO;
import com.medev.microservice_app.Entity.Compte;
import com.medev.microservice_app.Mapper.AccountMapper;
import com.medev.microservice_app.Service.AccountService;
import com.medev.microservice_app.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CompteRestController {

    private CompteRepository compteRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;
    public CompteRestController(CompteRepository compteRepository){
        this.compteRepository = compteRepository;
    }

    @GetMapping("/comptes")
    public List<Compte> Comptes(){
        return compteRepository.findAll();
    }

    @GetMapping("/comptes/{id}")
    public Compte compte(@PathVariable String id){
        return compteRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("account %s not found",id)) );

    }

    @PostMapping("/comptes")
    public CompteResponseDTO save(@RequestBody CompteRequestDTO requestDTO){

        return accountService.addCompte(requestDTO);
    }

    @PutMapping("/comptes")
    public Compte update(@PathVariable String id,@RequestBody Compte compte){
        Compte account = compteRepository.findById(id).orElseThrow();
        if(compte.getBalance()!=null) account.setBalance(compte.getBalance());
        if(compte.getCreateAt()==null) account.setCreateAt(new Date());
        if(compte.getType()!=null) account.setType(compte.getType());
        if(compte.getCurrency()!=null) account.setCurrency(compte.getCurrency());
        return compteRepository.save(compte);
    }

    @DeleteMapping("/comptes/{id}")
    public void delete(@PathVariable String id){
        compteRepository.deleteById(id);
    }

    
}

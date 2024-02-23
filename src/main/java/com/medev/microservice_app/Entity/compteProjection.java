package com.medev.microservice_app.Entity;


import com.medev.microservice_app.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Compte.class,name = "p1")
public interface compteProjection {

    public String getId();
    public Double getBalance();
    public AccountType getType();
}

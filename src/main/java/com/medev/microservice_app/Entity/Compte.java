package com.medev.microservice_app.Entity;

import com.medev.microservice_app.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Compte {

    @Id
    private String id;
    private Date createAt;
    private Double balance;
    private String currency;

    @Enumerated(EnumType.STRING)
    private AccountType type;


}

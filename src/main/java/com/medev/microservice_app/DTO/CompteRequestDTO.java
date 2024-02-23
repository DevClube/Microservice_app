package com.medev.microservice_app.DTO;

import com.medev.microservice_app.enums.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class CompteRequestDTO {


    private Double balance;
    private String currency;

    private AccountType type;
}

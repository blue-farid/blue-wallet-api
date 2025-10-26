package com.snapp.pay.insurance.bluewallet.api.v1.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CustomerDto {
    private Long id;
    @NotEmpty
    private String mail;
}

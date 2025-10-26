package com.snapp.pay.insurance.bluewallet.api.v1.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class WalletDto {
    private Long id;
    private Long customerId;
    private BigDecimal balance;
}

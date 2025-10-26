package com.snapp.pay.insurance.bluewallet.api.v1.model;

import lombok.Data;

import java.math.BigDecimal;

//TODO we should not show our database id
@Data
public class TransactionDto {
    private Long id;
    private Long fromWalletId;
    private Long toWalletId;
    private BigDecimal amount;
}

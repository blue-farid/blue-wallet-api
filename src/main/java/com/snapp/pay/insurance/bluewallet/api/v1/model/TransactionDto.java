package com.snapp.pay.insurance.bluewallet.api.v1.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

//TODO we should not show our database id
@Data
public class TransactionDto {
    private Long id;
    private Long walletId;
    private String type;
    private BigDecimal amount;
    private Date date;
}

package com.snapp.pay.insurance.bluewallet.api.v1.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequest {
    private Long toWalletId;
    private BigDecimal amount;
}

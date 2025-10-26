package com.snapp.pay.insurance.bluewallet.api.v1.request;

import com.snapp.pay.insurance.bluewallet.api.v1.model.TransactionDto;
import lombok.Data;

@Data
public class TransactionRequest {
    private TransactionDto transaction;
}

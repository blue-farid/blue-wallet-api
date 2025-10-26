package com.snapp.pay.insurance.bluewallet.api.v1.response;

import com.snapp.pay.insurance.bluewallet.api.v1.model.TransactionDto;
import com.snapp.pay.insurance.bluewallet.api.v1.model.WalletDto;
import lombok.Data;

@Data
public class TransactionResponse {
    private TransactionDto transaction;
    private WalletDto wallet;
}

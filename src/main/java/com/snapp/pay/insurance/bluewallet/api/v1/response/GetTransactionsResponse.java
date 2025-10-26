package com.snapp.pay.insurance.bluewallet.api.v1.response;

import com.snapp.pay.insurance.bluewallet.api.v1.model.TransactionDto;
import lombok.Data;
import org.springframework.data.domain.Page;

@Data
public class GetTransactionsResponse {
    private Page<TransactionDto> transactions;
}

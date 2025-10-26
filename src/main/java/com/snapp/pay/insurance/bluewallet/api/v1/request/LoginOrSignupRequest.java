package com.snapp.pay.insurance.bluewallet.api.v1.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

//TODO we could add custom messages
// for validation errors

@Data
public class LoginOrSignupRequest {
    @NotEmpty
    private String mail;
    @NotEmpty
    private String otp;
}

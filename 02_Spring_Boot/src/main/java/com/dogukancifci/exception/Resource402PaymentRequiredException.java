package com.dogukancifci.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 402: Zorunlu Ödeme (Payment Required)
@ResponseStatus(value = HttpStatus.PAYMENT_REQUIRED)
public class Resource402PaymentRequiredException extends RuntimeException{

    // Override
    public Resource402PaymentRequiredException(String message) {
        super(message);
    }
}

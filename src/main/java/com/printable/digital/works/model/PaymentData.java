package com.printable.digital.works.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Component
public class PaymentData {
    PaymentOptions paymentOptions;

    //credit card info

    String cardHolder;
    String cardNr;
    Date expirationDate;
    int securityCode;
}





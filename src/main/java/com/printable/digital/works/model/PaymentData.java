package com.printable.digital.works.model;

import com.printable.digital.works.model.enums.PaymentOptions;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class PaymentData {
    PaymentOptions paymentOptions;

    //credit card info
    String cardHolder;
    String cardNr;
    Date expirationDate;
    int securityCode;

}



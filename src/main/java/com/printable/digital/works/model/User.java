package com.printable.digital.works.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Data
@Component
@Document
public class User {
    String userName;
    String password;

    PaymentData paymentData;
    PersonalData personalData;

    ShoppingCart shoppingCart;
    ShoppingCart shoppingCartWishlist;

}

package com.printable.digital.works.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@Builder
public class User {
    String userName;
    String password;

    PaymentData paymentData;
    PersonalData personalData;

    ShoppingCart shoppingCart;
    ShoppingCart shoppingCartWishlist;

}

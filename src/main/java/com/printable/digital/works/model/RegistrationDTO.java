package com.printable.digital.works.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class RegistrationDTO { // DTO = Data Transfer Object
    String userName;
    String password;
    String confirmationPassword;
    String email;

}

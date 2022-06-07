package com.printable.digital.works.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserCredentials {
    String userName;
    String password;

}

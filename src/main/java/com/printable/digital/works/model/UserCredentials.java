package com.printable.digital.works.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserCredentials {
    String userName;
    String password;

}
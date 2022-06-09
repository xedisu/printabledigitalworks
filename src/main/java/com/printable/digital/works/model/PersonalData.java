package com.printable.digital.works.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PersonalData {
    String firstName;
    String lastName;
    String email;
    String phoneNr;
    String address;

}

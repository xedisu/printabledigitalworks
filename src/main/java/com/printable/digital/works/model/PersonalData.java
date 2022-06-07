package com.printable.digital.works.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PersonalData {
    String name;
    String email;
    String phoneNr;
    String address;

}

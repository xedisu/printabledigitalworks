package com.printable.digital.works.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@Builder
public class PersonalData {
    String name;
    String email;
    String phoneNr;
    String address;


}

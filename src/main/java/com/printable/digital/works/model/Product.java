package com.printable.digital.works.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Builder
public class Product {
    String name;
    Float price;
    Resolution resolution;
    String creator;
    Themes themes;
    Boolean availability;
    Rating rating;

}

package com.printable.digital.works.model;

import com.printable.digital.works.model.enums.Rating;
import com.printable.digital.works.model.enums.Themes;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {
    String name;
    Float price;
    Resolution resolution;
    String creator;
    Themes themes;
    Boolean availability;
    Rating rating;

}

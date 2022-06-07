package com.printable.digital.works.model;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
@Data
public class ShoppingCart {
    ArrayList<Product>products;

}

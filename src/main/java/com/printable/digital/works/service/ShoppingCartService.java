package com.printable.digital.works.service;

import com.printable.digital.works.model.Product;
import com.printable.digital.works.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
    @Autowired
    User user;

    float totalCost;

    public float getTotalCost() {
        return totalCost;
    }

    public void addProduct(Product product) {
        user.getShoppingCart().getProducts().add(product);
        totalCost += product.getPrice();
    }

    public void deleteProduct(Product product) {
        user.getShoppingCart().getProducts().remove(product);
        totalCost -= product.getPrice();
    }

    public void clearShoppingCart() {
        user.getShoppingCart().getProducts().clear();
        totalCost = (float) 0;
    }

    public void applyDiscount(float discount) {
        totalCost *= 1 - discount;
    }

}

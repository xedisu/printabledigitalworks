package com.printable.digital.works.service;

import com.printable.digital.works.model.Product;
import com.printable.digital.works.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
    @Autowired
    User user;
    Float totalCost;

    public Float getTotalCost() {
        return totalCost;
    }

    public void addProduct(Product product) {
        user.getShoppingCart().getProducts().add(product);
        updateTotalCost();
    }

    public void deleteProduct(Product product) {
        user.getShoppingCart().getProducts().remove(product);
        updateTotalCost();
    }

    public void moveToWishlist(Product product) {
        boolean removed = user.getShoppingCart().getProducts().remove(product);
        if (removed) {
            user.getShoppingCartWishlist().getProducts().add(product);
            updateTotalCost();
        }
    }

    public void moveAllToWishlist() {
        user.getShoppingCartWishlist().getProducts().addAll(user.getShoppingCart().getProducts());
        clearShoppingCart();
    }

    public void clearShoppingCart() {
        user.getShoppingCart().getProducts().clear();
        updateTotalCost();
    }

    public void updateTotalCost() {
        totalCost = (float) 0;
        for (Product product : user.getShoppingCart().getProducts()) {
            totalCost += product.getPrice();
        }
    }

    public float applyDiscount(Product product, float discount) {
        return product.getPrice() * (1 - discount);
    }
}

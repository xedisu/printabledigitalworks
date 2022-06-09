package com.printable.digital.works.service;

import com.printable.digital.works.model.Product;
import com.printable.digital.works.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishlistService {
    @Autowired
    User user;

    public void addWishlistProduct(Product product) {
        user.getShoppingCartWishlist().getProducts().add(product);
    }

    public void deleteWishlistProduct(Product product) {
        user.getShoppingCartWishlist().getProducts().remove(product);
    }

    public void clearWishlist(Product product) {
        user.getShoppingCartWishlist().getProducts().clear();
    }

}


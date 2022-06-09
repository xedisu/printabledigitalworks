package com.printable.digital.works.service;

import com.printable.digital.works.model.Product;
import com.printable.digital.works.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    User user;

    @Autowired
    ShoppingCartService shoppingCartService;

    @Autowired
    WishlistService wishlistService;


    public void moveProductFromShoppingCartToWishlist(Product product) {
        shoppingCartService.deleteProduct(product);
        wishlistService.addWishlistProduct(product);
    }

    public void moveAllProductsFromShoppingCartToWishlist() {
        for (Product product : user.getShoppingCart().getProducts()) {
            wishlistService.addWishlistProduct(product);
        }
        shoppingCartService.clearShoppingCart();
    }

    public void moveProductFromWishlistToShoppingCart(Product product) {
        wishlistService.deleteWishlistProduct(product);
        shoppingCartService.addProduct(product);
    }

}

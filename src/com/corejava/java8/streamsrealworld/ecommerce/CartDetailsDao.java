package com.corejava.java8.streamsrealworld.ecommerce;

import java.util.List;
import java.util.Optional;

public class CartDetailsDao {
    public List<User> getCartDetails(){
        // Cart Items
        CartItem ci1 = new CartItem(100.0, 2); // 200
        CartItem ci2 = new CartItem(50.0, 1);  // 50
        CartItem ci3 = new CartItem(300.0, 1); // 300

// Carts
        Cart cart1 = new Cart(Optional.of(List.of(ci1, ci2)));
        Cart cart2 = new Cart(Optional.of(List.of(ci3)));
        Cart cart3 = new Cart(Optional.empty());

// Users
        User u1 = new User("U1", Optional.of(cart1)); // ✅ 250
        User u2 = new User("U2", Optional.of(cart2)); // ✅ 300
        User u3 = new User("U3", Optional.of(cart3)); // ❌ empty cart
        User u4 = new User("U4", Optional.empty());   // ❌ no cart

        List<User> users = List.of(u1, u2, u3, u4);

        return users;
    }
}

package com.corejava.java8.streamsrealworld.ecommerce;

import java.util.Optional;

class User {
    private String userId;
    private Optional<Cart> cart;

    public User(String userId, Optional<Cart> cart) {
        this.userId = userId;
        this.cart = cart;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Optional<Cart> getCart() {
        return cart;
    }

    public void setCart(Optional<Cart> cart) {
        this.cart = cart;
    }
}

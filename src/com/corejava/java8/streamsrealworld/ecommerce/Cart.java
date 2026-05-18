package com.corejava.java8.streamsrealworld.ecommerce;

import java.util.List;
import java.util.Optional;

class Cart {
    private Optional<List<CartItem>> items;

    public Optional<List<CartItem>> getItems() {
        return items;
    }

    public void setItems(Optional<List<CartItem>> items) {
        this.items = items;
    }

    public Cart(Optional<List<CartItem>> items) {
        this.items = items;
    }
}

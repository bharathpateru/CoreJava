package com.corejava.java8.streamsrealworld.order;

import java.util.List;

public class OrdersDAo {
    public List<Order> getOrders(){
        List<Order> orders = List.of(
                new Order("O1", "C1", 1200.0, OrderStatus.COMPLETED),
                new Order("O2", "C2", 800.0,  OrderStatus.CANCELLED),
                new Order("O3", "C1", 400.0,  OrderStatus.COMPLETED),
                new Order("O4", "C3", 1500.0, OrderStatus.CREATED),
                new Order("O5", "C2", 700.0,  OrderStatus.COMPLETED),
                new Order("O6", "C3", 300.0,  OrderStatus.COMPLETED)
        );
        return orders;
    }
}

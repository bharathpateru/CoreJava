package com.corejava.java8.streamsrealworld.orders;

import java.util.List;

public class OrdersDao {
    public List<Order> getOrders(){
        List<Order> orders = List.of(
                new Order("O1", OrderStatus.COMPLETED,
                        List.of(
                                new OrderItem("P1", 2),
                                new OrderItem("P2", 1)
                        )
                ),
                new Order("O2", OrderStatus.CANCELLED,
                        List.of(
                                new OrderItem("P1", 5)
                        )
                ),
                new Order("O3", OrderStatus.COMPLETED,
                        List.of(
                                new OrderItem("P2", 3),
                                new OrderItem("P3", 4)
                        )
                ),
                new Order("O4", OrderStatus.COMPLETED,
                        List.of(
                                new OrderItem("P1", 1),
                                new OrderItem("P3", 2)
                        )
                )
        );

        return orders;
    }
}

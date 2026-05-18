package com.corejava.java8.streamsrealworld.orders;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderService {
    public static void main(String[] args) {

        List<Order> orderList = new OrdersDao().getOrders();

        Map<String, Integer> collect = orderList.stream()
                .filter((order) -> OrderStatus.COMPLETED.equals(order.getStatus()))
                .flatMap((order) -> order.getItems().stream())
                .collect(Collectors.groupingBy(OrderItem::getProductId,
                        Collectors.summingInt(OrderItem::getQuantity)));

        System.out.println(collect);
        System.out.println("---------------------------------");
       Map<String, Integer> totalQuantityPerProduct =
                orderList.stream()
                        .filter(order -> OrderStatus.COMPLETED.equals(order.getStatus()))
                        .flatMap(order -> order.getItems().stream())
                        .collect(Collectors.groupingBy(
                                OrderItem::getProductId,
                                Collectors.summingInt(OrderItem::getQuantity)
                        ));
        System.out.println(totalQuantityPerProduct);
    }
}

package com.corejava.java8.streamsrealworld.order;

import com.corejava.java8.streamsrealworld.emp.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderService {
    public static void main(String[] args) {
        List<Order> orderList = new OrdersDAo().getOrders();

      /*
      Consider only COMPLETED orders
      Group orders by customerId
      Calculate the total order amount per customer
      */
        Map<String, Double> doubleMap = orderList.stream().filter(order -> OrderStatus.COMPLETED.equals(order.getStatus()))
                .collect(Collectors.groupingBy(Order::getCustomerId, Collectors.summingDouble(Order::getAmount)));

        doubleMap.forEach((key, value)->System.out.println(key + " ------------ " + value));


    }
}

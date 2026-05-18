package com.corejava.java8.streamsrealworld.orders;

import java.util.List;

class Order {
    private String orderId;
    private OrderStatus status;
    private List<OrderItem> items;

    public Order(String orderId, OrderStatus status, List<OrderItem> items) {
        this.orderId = orderId;
        this.status = status;
        this.items = items;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", status=" + status +
                ", items=" + items +
                '}';
    }
}

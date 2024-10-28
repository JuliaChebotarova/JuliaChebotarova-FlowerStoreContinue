package com.example.demo;

import java.util.List;

public class Order {
    private List<Item> items;
    private double totalAmount;
    private Payment paymentStrategy;
    private Delivery deliveryStrategy;

    public Order(List<Item> items) {
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public String processOrderPayment() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        return paymentStrategy.pay(totalAmount);
    }

    public String processOrderDelivery() {
        if (deliveryStrategy == null) {
            throw new IllegalStateException("Delivery strategy not set");
        }
        return deliveryStrategy.deliver(items);
    }
}

package com.example.demo;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String deliver(List<Item> items) {
        return "Items delivered by DHL: " + items;
    }
}

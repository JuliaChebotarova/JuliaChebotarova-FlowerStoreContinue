package com.example.demo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class DeliveryStrategyTest {

    @Test
    void testPostDelivery() {
        Delivery delivery = new PostDeliveryStrategy();
        List<Item> items = List.of(new Item("Book", 15.0));
        String result = delivery.deliver(items);
        assertTrue(result.contains("Items delivered by Post"));
    }

    @Test
    void testDHLDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();
        List<Item> items = List.of(new Item("Laptop", 1000.0));
        String result = delivery.deliver(items);
        assertTrue(result.contains("Items delivered by DHL"));
    }
}

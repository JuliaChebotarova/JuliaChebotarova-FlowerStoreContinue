package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentStrategyTest {

    @Test
    void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy("1234567812345678");
        String result = payment.pay(100.0);
        assertTrue(result.contains("Paid 100.0 using Credit Card ending in 5678"));
    }

    @Test
    void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy("test@example.com");
        String result = payment.pay(50.0);
        assertTrue(result.contains("Paid 50.0 using PayPal account test@example.com"));
    }
}

package com.example.demo;

public class CreditCardPaymentStrategy implements Payment {
    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String pay(double amount) {
        return "Paid " + amount + " using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4);
    }
}

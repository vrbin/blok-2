package org.example;

public interface PaymentMethod {
    void processPayment (double amount);

    class CreditCard implements PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Zaplatil jsi kreditkou " + amount + " penez.");
        }
    }
    class PayPal implements PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Zaplatil jsi pejpalem " + amount + " penez.");
        }
    }
    class Cash implements PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Vytahl jsi z kesene " + amount + " penez.");
        }
    }
}

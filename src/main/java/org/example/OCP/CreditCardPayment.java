package org.example.OCP;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit card payment of $"+ amount);
    }
}

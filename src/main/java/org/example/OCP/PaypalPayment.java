package org.example.OCP;

public class PaypalPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment of $"+ amount);

    }
}

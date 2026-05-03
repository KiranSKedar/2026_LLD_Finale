package org.example.OCP;

public class UPIPayment implements PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $"+ amount);

    }
}

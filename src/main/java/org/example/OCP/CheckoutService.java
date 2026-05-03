package org.example.OCP;

public class CheckoutService {
    public void processPayment(PaymentMethod paymentMethod,double amount){
        PaymentProcessor processor=new PaymentProcessor();
        processor.process(paymentMethod,amount);
    }
}

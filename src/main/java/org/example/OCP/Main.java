package org.example.OCP;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService=new CheckoutService();
        checkoutService.processPayment(new CreditCardPayment(),100.00);
        checkoutService.processPayment(new PaypalPayment(),200.00);
        checkoutService.processPayment(new UPIPayment(),100.00);
    }
}

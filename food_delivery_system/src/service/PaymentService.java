package service;

public class PaymentService {
    public void processPayment(String orderId,double amount){
        System.out.println("Payment of " + amount + "done for order");
    }
}

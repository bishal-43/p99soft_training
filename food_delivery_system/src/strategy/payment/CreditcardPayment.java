package strategy.payment;

import java.util.UUID;

public class CreditcardPayment implements PaymentStrategy{

    private final String cardNumber;

    public CreditcardPayment(String cardNumber){
        this.cardNumber =  cardNumber;
    }

    @Override
    public PaymentResult pay(PaymentRequest request) {
        System.out.println("Processing Card payment");

        String transactionId = UUID.randomUUID().toString();

        return new PaymentResult(true, transactionId, "Card payment successful for order: " + request.getOrderId());
    }
}

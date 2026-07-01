package strategy.payment;

import java.util.UUID;

public class UPIPayment implements PaymentStrategy{

    private final String upiId;

    public UPIPayment(String upiId){
        this.upiId = upiId;
    }


    @Override
    public PaymentResult pay(PaymentRequest request) {

        System.out.println("Processing upi payment");
        String transactionId = UUID.randomUUID().toString();

        return new PaymentResult(true, transactionId, "UPI payment successful for order: " + request.getOrderId());
    }
}

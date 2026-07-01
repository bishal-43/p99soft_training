package strategy.payment;

public class PaymentRequest {
    private final String orderId;
    private final double amount;

    public PaymentRequest(String orderId, double amount){
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId(){
        return orderId;
    }

    public double getAmount(){
        return amount;
    }
}

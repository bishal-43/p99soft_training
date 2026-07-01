package strategy.payment;

public interface PaymentStrategy {

    PaymentResult pay(PaymentRequest request);
}

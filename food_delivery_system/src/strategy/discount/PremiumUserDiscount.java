package strategy.discount;

public class PremiumUserDiscount implements DiscountStrategy{

    @Override
    public double applyDiscount(double amount){
        return amount * 0.80;             // premium user gets 20% discount
    }


}

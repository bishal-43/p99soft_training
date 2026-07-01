package strategy.discount;

public class CouponDiscount implements DiscountStrategy{

    private final String CouponCode;

    public CouponDiscount(String CouponCode){
        this.CouponCode = CouponCode;
    }

    @Override
    public double applyDiscount(double amount){
        switch (CouponCode){
            case "WELCOME100":
                return Math.max(amount - 100,0);

            case "SAVE100":
                return Math.max(amount - 100,0);

            default:
                return amount;

        }
    }
}

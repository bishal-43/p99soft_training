package service;

import model.Cart;
import model.CartItem;
import strategy.discount.DiscountStrategy;

public class PricingService {
    public double calculateTotal(Cart cart, DiscountStrategy strategy){
        double total = 0;

        for(CartItem item: cart.getItems()){
            total += item.getTotalPrice();
        }
        return strategy.applyDiscount(total);
    }
}

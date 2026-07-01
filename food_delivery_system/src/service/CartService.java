package service;

import model.Cart;
import model.CartItem;
import model.FoodItem;

public class CartService {
    public void addItem(Cart cart, FoodItem foodItem, int quantity){
        cart.addItem(new CartItem(foodItem,quantity));
    }

    public void removeItem(Cart cart, CartItem item){
        cart.removeItem(item);
    }
}

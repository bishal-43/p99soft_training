package model;
import java.util.List;
import java.util.ArrayList;

public class Cart {
    private final List<CartItems> cartItems;

    public Cart(){
        cartItems = new ArrayList<>();
    }

    public List<CartItems> getCartItems(){
        return cartItems;
    }
}

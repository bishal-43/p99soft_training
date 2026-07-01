package service;

import model.CartItems;
import model.Cart;
import model.Order;

public class OrderService {
    public Order createOrder(int orderId,Cart cart ){

        if(cart.getCartItems().isEmpty()){
            System.out.println("cart is empty");
            return null;
        }

        Order order = new Order(orderId, cart.getCartItems());
        System.out.println("Order created" + orderId);

        return order;
    }

    public Order cancelOrder(Order order){
        order.
    }

}

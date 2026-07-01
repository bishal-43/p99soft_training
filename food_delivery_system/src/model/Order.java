package model;

import model.Cart;

public class Order {
    private final Cart cart;
    private int orderId;
    private Restaurant restaurant;

    public Order(int orderId, Restaurant restaurant,Cart cart){
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.cart = cart;
    }

    public int getOrderId(){
        return orderId;
    }

    public Restaurant getRestaurant(){
        return restaurant;
    }

    public Cart getCart(){
        return cart;
    }
}

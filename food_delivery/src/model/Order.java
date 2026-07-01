package model;

import java.util.List;

public class Order {
    private final double orderId;
    private final List<FoodItems> items;

    public Order(int orderId, List<CartItems> items){
        this.orderId = orderId;
        this.items = items;
    }

    public double getOrderId(){
        return orderId;
    }

    public List<FoodItems> getItems(){
        return items;
    }
}

package model;

public class CartItem {
    private FoodItem foodItem;
    private int quantity;

    public CartItem(FoodItem foodItem, int quantity){
        this.foodItem =foodItem;
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return foodItem.getPrice()*quantity;
    }

    public FoodItem getFoodItems(){
        return foodItem;
    }

    public int getQuantity(){
        return quantity;
    }
}

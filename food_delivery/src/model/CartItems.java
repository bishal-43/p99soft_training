package model;

public class CartItems {
    private FoodItems foodItems;
    private int quantity;

    public CartItems(FoodItems foodItems, int quantity){
        this.foodItems = foodItems;
        this.quantity = quantity;
    }


    public FoodItems getFoodItems(){
        return foodItems;
    }

    public void setFoodItems(FoodItems foodItems){
        this.foodItems = foodItems;
    }


    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }




}

package model;

import java.util.List;

public class Restaurant {
    private int id;
    private String name;
    private List<FoodItem> menu;


    public Restaurant(int id, String name, List<FoodItem> menu){
        this.id = id;
        this.name = name;
        this.menu = menu;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

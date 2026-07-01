package repository.implementation;

import model.Restaurant;
import repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantRepositoryImpl implements RestaurantRepository {
    private final Map<Integer, Restaurant> restaurants = new HashMap<>();

    @Override
    public void save(Restaurant restaurant){

        restaurants.put(restaurant.getId(), restaurant);
    }

    @Override
    public Restaurant findById(int id){
        return restaurants.get(id);
    }


    @Override
    public List<Restaurant> findAll(){
        return new ArrayList<>(restaurants.values());
    }
}

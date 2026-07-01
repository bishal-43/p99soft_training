package repository;

import model.Restaurant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RestaurantRepository {



    public void save(Restaurant restaurant);

    public Restaurant findById(int id);

    public List<Restaurant> findAll();
}

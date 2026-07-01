package repository;

import model.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OrderRepository {


    public void save(Order order);

    public Order findById(int orderId);

    public List<Order> findAll();
}

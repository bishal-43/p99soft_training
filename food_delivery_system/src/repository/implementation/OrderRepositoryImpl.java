package repository.implementation;

import model.Order;
import repository.OrderRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepositoryImpl implements OrderRepository {

    private final Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void save(Order order){
        orders.put( order.getOrderId(), order);
    }

    @Override
    public Order findById(int orderId){
        return orders.get(orderId);
    }

    @Override
    public List<Order> findAll(){
        return new ArrayList<>(orders.values());
    }
}

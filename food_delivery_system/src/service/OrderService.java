package service;

import model.Order;
import repository.OrderRepository;

public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void createOrder(Order order){
        orderRepository.save(order);
        System.out.println("Order created");
    }
}

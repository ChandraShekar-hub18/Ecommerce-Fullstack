package com.learning.order_service.service;


import com.learning.order_service.entity.Order;
import com.learning.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> AllOrders(){
        List orders=orderRepository.findAll();
        return orders;

    }

    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public  Order saveOrder(Order order){
        Order savedOrder= orderRepository.save(order);
        return savedOrder;
    }

    public  void deleteOrderbyID(Long orderId) {
        orderRepository.deleteById(orderId);
    }

}

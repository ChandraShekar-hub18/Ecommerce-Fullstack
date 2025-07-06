package com.learning.order_service.controller;

import com.learning.order_service.entity.Order;
import com.learning.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping(path="/saveOrder")
    public Order saveOrder(@RequestBody  Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping(path="/allOrders")
    public List<Order> getAllOrders() {
        return orderService.AllOrders();
    }
    @GetMapping(path="/getOrderById/{orderId}")
    public Order getOrderById(@PathVariable Long orderId) {
        return orderService.getOrderById(orderId);
    }

    @DeleteMapping(path="/deleteOrderById/{orderId}")
    public String deleteOrderById(@PathVariable Long orderId) {
        orderService.deleteOrderbyID(orderId);
        return "Order with ID " + orderId + " deleted successfully.";
    }
}

package com.learning.order_service.repository;

import com.learning.order_service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInterface extends JpaRepository<Order, Long> {
}

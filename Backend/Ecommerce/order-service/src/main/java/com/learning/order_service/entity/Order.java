package com.learning.order_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="orders",uniqueConstraints = {@UniqueConstraint( columnNames = "orderId")})

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue (strategy =GenerationType.AUTO)
    @Column(name="orderId",nullable=false,unique=true)
    private Long orderId;

    @Column(name="orderDate")
    private LocalDateTime orderDate;

    @PrePersist
    public void prePersist() {
        if (orderDate == null) {
            orderDate = LocalDateTime.now();
        }
    }


    @Column(name="price")
    private BigDecimal price;

    @Column(name="status",length = 10)
    private String status;

    @Column(name="address",length = 50)
    private String address;

    @Column(name="user_id")
    private String user_id;
}

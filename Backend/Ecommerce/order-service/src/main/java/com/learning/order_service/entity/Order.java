package com.learning.order_service.entity;

import jakarta.persistence.*;
import lombok.*;

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

    @Column(name="OrderDate",nullable=false)
    private Date orderDate;

    @Column(name="price")
    private float price;

    @Column(name="status",length = 10)
    private String status;

    @Column(name="address",length = 50)
    private String address;

    @Column(name="user_id")
    private String user_id;
}

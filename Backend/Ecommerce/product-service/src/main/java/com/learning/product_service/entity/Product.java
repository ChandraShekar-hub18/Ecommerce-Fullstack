package com.learning.product_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="products",uniqueConstraints = {@UniqueConstraint( columnNames = "product_id")})

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    private Long productId;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="brand")
    private String brand;

    @Column(name="price")
    private BigDecimal price;

    @ElementCollection
    @CollectionTable(name = "product_features", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "feature")
    private List<String> features;


    @Column(name="stock",length = 10)
    private String stock;

    @Column(name="image_url")
    private String imageUrl;
}

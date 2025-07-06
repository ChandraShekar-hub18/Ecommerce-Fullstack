package com.learning.product_service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private Long productId;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private List<String> features;
    private String stock;
    private String imageUrl;

}

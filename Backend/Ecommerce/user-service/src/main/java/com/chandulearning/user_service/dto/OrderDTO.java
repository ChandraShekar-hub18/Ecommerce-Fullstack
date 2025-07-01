package com.chandulearning.user_service.dto;

import lombok.Data;

@Data
public class OrderDTO {
    private Long orderId;
    private String ItemName;
    private Double price;
    private String status;
}

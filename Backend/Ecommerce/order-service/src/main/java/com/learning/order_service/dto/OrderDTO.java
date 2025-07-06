package com.learning.order_service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
public class OrderDTO {
    private Long orderId;
    private LocalDate orderDate;
    private BigDecimal price;
    private String status;
    private String address;
    private String user_id;

}

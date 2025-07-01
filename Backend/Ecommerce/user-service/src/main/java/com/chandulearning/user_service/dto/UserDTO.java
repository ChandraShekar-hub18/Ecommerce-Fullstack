package com.chandulearning.user_service.dto;

import com.chandulearning.user_service.entity.Role;

import java.util.List;

public class UserDTO {

    private Integer userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Role role;
    // Adding orders from order table which is ordered by customer
    private List<OrderDTO> orders;
}

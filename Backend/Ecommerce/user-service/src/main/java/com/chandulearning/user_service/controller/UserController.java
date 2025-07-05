package com.chandulearning.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(path = "/")
    public static String hello(){
        return "Hello world";
    }

}

package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home() {

        return "Method Level Security Project";
    }

    @GetMapping("/admin")
    public String admin() {

        return userService.adminData();
    }

    @GetMapping("/user")
    public String user() {

        return userService.userData();
    }
}
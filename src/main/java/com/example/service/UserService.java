package com.example.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @PreAuthorize("hasRole('ADMIN')")
    public String adminData() {

        return "Welcome Admin! You can access admin data.";
    }

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String userData() {

        return "Welcome User! You can access user data.";
    }
}  
package com.example.ecommerce.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.models.User;
import com.example.ecommerce.repository.UserRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserRep userRep;

    @GetMapping("users/get-msg")
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.ok(userRep.findAll());
    }

    @PostMapping("users/post-msg")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userRep.save(user);
       return ResponseEntity.ok("User created successfully");
    }
    
}

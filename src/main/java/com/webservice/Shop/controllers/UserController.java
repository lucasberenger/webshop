package com.webservice.Shop.controllers;

import com.webservice.Shop.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"lucas", "lucas@io.com", "99999", "123");
        return ResponseEntity.ok().body(u);
    }
}

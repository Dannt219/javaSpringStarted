package com.aidan.starter_spring_boot.controller;

import com.aidan.starter_spring_boot.dto.request.UserCreationRequest;
import com.aidan.starter_spring_boot.entity.User;
import com.aidan.starter_spring_boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User creatiUser(@RequestBody UserCreationRequest request){
        return userService.createRequest(request);
    }
}

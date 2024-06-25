package com.aidan.starter_spring_boot.service;

import com.aidan.starter_spring_boot.dto.request.UserCreationRequest;
import com.aidan.starter_spring_boot.entity.User;
import com.aidan.starter_spring_boot.repository.UserRopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRopository userRopository;

    public User createRequest(UserCreationRequest request){
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRopository.save(user);
    }
}

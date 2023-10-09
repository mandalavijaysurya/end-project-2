package org.project2.userservice.controller;

import org.project2.userservice.model.User;
import org.project2.userservice.service.UserOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class UserServiceController {

    private final UserOperation userOperation;

    public UserServiceController(UserOperation userOperation){
        this.userOperation = userOperation;
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user){
        userOperation.addUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}

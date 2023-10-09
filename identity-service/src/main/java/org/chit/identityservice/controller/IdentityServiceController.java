package org.chit.identityservice.controller;

import lombok.RequiredArgsConstructor;
import org.chit.identityservice.model.User;
import org.chit.identityservice.service.IdentityServiceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class IdentityServiceController {
    private final IdentityServiceService identityService;
    @GetMapping("/user")
    public String addUser(@RequestBody User user){
        return "Hi";
    }
}

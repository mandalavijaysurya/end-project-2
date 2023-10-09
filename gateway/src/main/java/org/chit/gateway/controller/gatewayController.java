package org.chit.gateway.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gatewayController {
    @GetMapping("/")
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<>("welcome", HttpStatusCode.valueOf(200));
    }
}

package org.project2.userservice.service.impl;

import io.github.resilience4j.retry.annotation.Retry;
import org.project2.userservice.model.User;
import org.project2.userservice.service.UserOperation;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class UserOperationImpl implements UserOperation {

    @Value("${identity-service.url}")
    private  String identityServiceURL;
    private final RestTemplate restTemplate;

    public UserOperationImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    @Override
    @Retry(name = "auth-retry")
    public User addUser(User user) {
        restTemplate.postForEntity(identityServiceURL,user,String.class, new HashMap<>());
        return user;
    }

}

package org.chit.identityservice.service.impl;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.chit.identityservice.entity.UserEntity;
import org.chit.identityservice.model.User;
import org.chit.identityservice.repository.IdentityRepository;
import org.chit.identityservice.service.IdentityServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IdentityServiceServiceImpl implements IdentityServiceService {

    private final IdentityRepository identityRepository;
    @Override
    public String addUser(User user) {
        UserEntity userEntity = UserEntity.builder()
                .userEmail(user.getUserEmail())
                .userName(user.getUserName())
                .password(user.getPassword())
                .build();
        return "";
    }

}

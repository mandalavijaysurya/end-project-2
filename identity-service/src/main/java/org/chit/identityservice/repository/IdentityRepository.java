package org.chit.identityservice.repository;

import org.chit.identityservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityRepository extends JpaRepository<UserEntity, Long> {
}

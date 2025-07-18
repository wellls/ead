package com.github.wellls.authuser.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.wellls.authuser.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}

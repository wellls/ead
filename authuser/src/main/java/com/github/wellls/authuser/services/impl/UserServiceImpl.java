package com.github.wellls.authuser.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.github.wellls.authuser.exceptions.NotFoundException;
import com.github.wellls.authuser.models.UserModel;
import com.github.wellls.authuser.repositories.UserRepository;
import com.github.wellls.authuser.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserModel> findById(UUID userId) {
        Optional<UserModel> userModelOptional = userRepository.findById(userId);
        if (userModelOptional.isEmpty()) {
            throw new NotFoundException("Error: User not found.");
        }
        return userModelOptional;
    }

    @Override
    public void delete(UserModel userModel) {
        userRepository.delete(userModel);
    }
}

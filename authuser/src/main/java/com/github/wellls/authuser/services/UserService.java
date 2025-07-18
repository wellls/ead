package com.github.wellls.authuser.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.github.wellls.authuser.dtos.UserRecordDto;
import com.github.wellls.authuser.models.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface UserService {

    List<UserModel> findAll();

    Optional<UserModel> findById(UUID userId);

    void delete(UserModel userModel);

    UserModel registerUser(UserRecordDto userRecordDto);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    UserModel updateUser(UserRecordDto userRecordDto, UserModel userModel);

    UserModel updatePassword(UserRecordDto userRecordDto, UserModel userModel);

    UserModel updateImage(UserRecordDto userRecordDto, UserModel userModel);

    Page<UserModel> findAll(Specification<UserModel> spec, Pageable pageable);
}
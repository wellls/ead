package com.github.wellls.authuser.dtos;

public record UserRecordDto(String username,
        String email,
        String password,
        String oldPassword,
        String fullName,
        String phoneNumber,
        String imageUrl) {
}
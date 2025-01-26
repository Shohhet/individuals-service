package com.shoggoth.individualsservice.dto.request;

public record RegisterUserRequest(
        String email,
        String password,
        String confirmPassword
) {
}

package com.shoggoth.individualsservice.dto.request;

public record LoginUserRequest(
        String login,
        String password
) {
}

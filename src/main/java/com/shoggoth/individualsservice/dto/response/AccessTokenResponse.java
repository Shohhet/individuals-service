package com.shoggoth.individualsservice.dto.response;

public record AccessTokenResponse(
    String accessToken,
    Integer expiresAt,
    String refreshToken,
    String tokenType
) {
}

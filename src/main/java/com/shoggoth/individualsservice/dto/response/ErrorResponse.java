package com.shoggoth.individualsservice.dto.response;

public record ErrorResponse(
        String message,
        Integer status
) {
}

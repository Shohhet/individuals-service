package com.shoggoth.individualsservice.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public record UserDataResponse(
        String id,
        String email,
        List<String> roles,
        LocalDateTime createdAt
) {
}

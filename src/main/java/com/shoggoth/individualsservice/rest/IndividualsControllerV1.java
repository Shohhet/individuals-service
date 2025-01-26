package com.shoggoth.individualsservice.rest;

import com.shoggoth.individualsservice.dto.request.LoginUserRequest;
import com.shoggoth.individualsservice.dto.request.RefreshTokenRequest;
import com.shoggoth.individualsservice.dto.request.RegisterUserRequest;
import com.shoggoth.individualsservice.dto.response.AccessTokenResponse;
import com.shoggoth.individualsservice.dto.response.UserDataResponse;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/auth")
public class IndividualsControllerV1 {

    @PostMapping("/registration")
    public Mono<AccessTokenResponse> registerUser(@RequestBody @Validated RegisterUserRequest registerUserRequest) {
        return Mono.empty();
    }

    @PostMapping("/login")
    public Mono<AccessTokenResponse> loginUser(@RequestBody @Validated LoginUserRequest loginUserRequest) {
        return Mono.empty();
    }

    @PostMapping("/refresh-token")
    public Mono<AccessTokenResponse> refreshToken(@RequestBody @Validated RefreshTokenRequest refreshTokenRequest) {
        return Mono.empty();
    }

    @GetMapping("/me")
    public Mono<UserDataResponse> getAuthenticatedUserData() {
        return Mono.empty();
    }


}

package com._xtech.jwt_authentication.controller;

import com._xtech.jwt_authentication.dto.UserRequestDto;
import com._xtech.jwt_authentication.dto.UserResponseDto;
import com._xtech.jwt_authentication.service.RegistrationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("register")
@RequiredArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDto registerUser(@Valid @RequestBody UserRequestDto userRequestDto){
        return registrationService.registerUser(userRequestDto);
    }
}

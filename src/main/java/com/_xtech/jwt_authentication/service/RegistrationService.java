package com._xtech.jwt_authentication.service;

import com._xtech.jwt_authentication.dto.UserRequestDto;
import com._xtech.jwt_authentication.dto.UserResponseDto;

public interface RegistrationService {
    UserResponseDto registerUser(UserRequestDto userRequestDto);
}

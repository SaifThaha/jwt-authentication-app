package com._xtech.jwt_authentication.service;

import com._xtech.jwt_authentication.dto.LoginRequest;

public interface AuthService {
    public String authenticateUser(LoginRequest loginRequest);
}

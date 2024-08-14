package com._xtech.jwt_authentication.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {

    public String generateToken(UserDetails userDetails);
    public String extractUsername(String JwtToken);

    boolean isTokenValid(String jwtToken);
}

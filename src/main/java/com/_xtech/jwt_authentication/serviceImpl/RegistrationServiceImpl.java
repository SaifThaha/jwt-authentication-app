package com._xtech.jwt_authentication.serviceImpl;

import com._xtech.jwt_authentication.dto.UserRequestDto;
import com._xtech.jwt_authentication.dto.UserResponseDto;
import com._xtech.jwt_authentication.entity.User;
import com._xtech.jwt_authentication.repository.UserRepository;
import com._xtech.jwt_authentication.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDto registerUser(UserRequestDto userRequestDto) {
        User user = modelMapper.map(userRequestDto, User.class);
        user.setPassword(passwordEncoder.encode(userRequestDto.getPassword()));

        User savedUser = userRepository.save(user);

        return modelMapper.map(savedUser,UserResponseDto.class);
    }
}

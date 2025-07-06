package com.chandulearning.user_service.service;

import com.chandulearning.user_service.dto.RegisterRequest;
import com.chandulearning.user_service.entity.Role;
import com.chandulearning.user_service.entity.User;
import com.chandulearning.user_service.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(RegisterRequest request) {
        if (userRepository.findByUserName(request.getUsername()).isPresent()) {
            throw new RuntimeException("Username already taken!");
        }

        User user = new User();
        user.setUserName(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setEmail(request.getEmail());
        user.setRole(Role.Customer);

        userRepository.save(user);
    }
}

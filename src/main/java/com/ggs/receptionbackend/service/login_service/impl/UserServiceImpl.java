package com.ggs.receptionbackend.service.login_service.impl;

import com.ggs.receptionbackend.DTO.UserDTO;
import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.repository.login_repository.UserRepository;
import com.ggs.receptionbackend.DTO.response.UserResponse;
import com.ggs.receptionbackend.service.login_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User searchUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserResponse isAuthenticated(UserDTO userDTO) {
        User user = userRepository.findUserByEmailAndPassword(userDTO.getEmail(), userDTO.getPassword());
        return UserResponse.builder()
                .fullName(user.getFullName())
                .rolName(user.getRol().getName())
                .build();
    }

    @Override
    public User updateUser(Long id, User user) {
        User newUser = userRepository.findById(id).orElse(null);
        if (newUser != null) {
            newUser.setEmail(user.getEmail());
            newUser.setPassword(user.getPassword());
            return userRepository.save(newUser);
        }
        return null;
    }
}

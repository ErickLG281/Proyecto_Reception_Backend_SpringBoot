package com.ggs.receptionbackend.service.login_service;

import com.ggs.receptionbackend.DTO.UserDTO;
import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.DTO.response.UserResponse;

public interface UserService {
    User searchUser(Long id);
    UserResponse isAuthenticated(UserDTO userDTO);
    User updateUser(Long id, User user);

}

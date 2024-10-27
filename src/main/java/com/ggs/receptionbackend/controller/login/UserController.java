package com.ggs.receptionbackend.controller.login;

import com.ggs.receptionbackend.DTO.UserDTO;
import com.ggs.receptionbackend.entity.login.User;
import com.ggs.receptionbackend.DTO.response.UserResponse;
import com.ggs.receptionbackend.service.login_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@CrossOrigin("http://localhost:5173")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<UserResponse> isAuthenticated(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.isAuthenticated(userDTO));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable(name = "userId") Long id, @RequestBody User user) {
        User newUser = userService.updateUser(id,user);
        if (newUser != null) {
            return ResponseEntity.ok(newUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

package com.english.core.controllers;

import com.english.core.dto.UserDTO;
import com.english.core.mappers.UserMapper;
import com.english.core.model.User;
import com.english.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable("id") Long pid) {
        User user = userService.getUser(pid);
        return userMapper.toDTO(user);
    }

}

package com.english.core.controllers;

import com.english.core.dto.RoleDTO;
import com.english.core.dto.UserDTO;
import com.english.core.model.Role;
import com.english.core.model.User;
import com.english.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable("id") Long pid) {
        User user = userService.getUser(pid);
        return toDTO(user);
    }

    private UserDTO toDTO(User user) {
        Set<RoleDTO> rolesDTO = toDTO(user.getRoles());
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .roles(rolesDTO)
                .build();
    }

    private Set<RoleDTO> toDTO(Set<Role> roles) {
        return roles.stream().map(role -> toDTO(role)).collect(Collectors.toSet());
    }

    private RoleDTO toDTO(Role role) {
        return RoleDTO.builder()
                .id(role.getId())
                .name(role.getName())
                .build();
    }
}

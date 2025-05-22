package com.sky.homework.controller;

import com.sky.homework.dto.UserDto;
import com.sky.homework.entity.User;
import com.sky.homework.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable final long id) {
        final User user = userService.getUser(id);
        return ResponseEntity.ok().body(new UserDto(
            user.getId(),
            user.getEmail(),
            user.getPassword(),
            user.getName()
        ));
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(final UserDto userDto) {
        final User user = userService.createUser(
            userDto.name(),
            userDto.password(),
            userDto.email()
        );
        return ResponseEntity.ok().body(new UserDto(
            user.getId(),
            user.getEmail(),
            user.getPassword(),
            user.getName()
        ));
    }

    @DeleteMapping
    public void deleteUser(final long id) {
        userService.deleteUser(id);
    }

}

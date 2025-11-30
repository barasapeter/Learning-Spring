package com.barasa.learn.controller;

import org.springframework.web.bind.annotation.*;
import com.barasa.learn.entity.User;
import com.barasa.learn.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @GetMapping("/email/{email}")
    public User getByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }
}

package com.example.validateUserName;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/login")
    public String login(@Valid @RequestBody UserDto userDto) {
        return "Login Successful";
    }
}

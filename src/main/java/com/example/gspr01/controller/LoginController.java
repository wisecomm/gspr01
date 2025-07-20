package com.example.gspr01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.gspr01.mapper.UserMapper;
import com.example.gspr01.model.User;

@RestController
@RequestMapping("/api")
public class LoginController {

//    @Autowired
//    private UserMapper userMapper;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // User user = userMapper.findByUsername(username);
        // if (user != null && user.getPassword().equals(password)) {
        //     return "Login Success";
        // }
        return "Login Failed";
    }
}
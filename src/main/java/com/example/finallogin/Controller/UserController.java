package com.example.finallogin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.finallogin.Dto.LoginDto;
import com.example.finallogin.Dto.UserDto;
import com.example.finallogin.Response.Message;
import com.example.finallogin.Service.UserService;

@RestController
@CrossOrigin
@RequestMapping("safar/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping(path = "/register")
    public Message registerUser(@RequestBody UserDto userDTO){
        Message id = userService.addUser(userDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDto loginDTO){
        Message loginMessage = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginMessage);
    }
}

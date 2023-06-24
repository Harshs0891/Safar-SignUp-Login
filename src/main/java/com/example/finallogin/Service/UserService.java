package com.example.finallogin.Service;


import com.example.finallogin.Dto.LoginDto;
import com.example.finallogin.Dto.UserDto;
import com.example.finallogin.Response.Message;

public interface UserService {

    Message addUser(UserDto userDTO);

    Message loginUser(LoginDto loginDTO);
    
}

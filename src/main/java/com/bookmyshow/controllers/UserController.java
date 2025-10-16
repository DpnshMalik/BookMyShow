package com.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bookmyshow.DTOS.SignUpRequestDTO;
import com.bookmyshow.DTOS.SignUpResponseDTO;
import com.bookmyshow.enums.ResponseStatus;
import com.bookmyshow.models.User;
import com.bookmyshow.services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public SignUpResponseDTO signUp(SignUpRequestDTO signUpRequestDTO){
        SignUpResponseDTO responseDTO = new SignUpResponseDTO();
        try{
            User user = userService.signUp(signUpRequestDTO.getEmail(),signUpRequestDTO.getPassword());
            responseDTO.setUserId(user.getId());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDTO;
    }

}


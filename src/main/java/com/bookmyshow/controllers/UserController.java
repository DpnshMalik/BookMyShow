package com.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bookmyshow.DTOS.SignUpRequestDTO;
import com.bookmyshow.DTOS.SignUpResponseDTO;
import com.bookmyshow.enums.ResponseStatus;
import com.bookmyshow.models.User;
import com.bookmyshow.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Endpoint to register a new user
     * Example POST /users/signup
     */
    @PostMapping("/signup")
    public ResponseEntity<SignUpResponseDTO> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO) {
        SignUpResponseDTO responseDTO = new SignUpResponseDTO();
        try {
            User user = userService.signUp(signUpRequestDTO.getEmail(), signUpRequestDTO.getPassword());
            responseDTO.setUserId(user.getId());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
        } catch (Exception e) {
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDTO);
        }
    }
}

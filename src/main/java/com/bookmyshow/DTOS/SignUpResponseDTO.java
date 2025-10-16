package com.bookmyshow.DTOS;

import com.bookmyshow.enums.ResponseStatus;

import lombok.Data;

@Data
public class SignUpResponseDTO {
    private ResponseStatus responseStatus;
    private Long userId;
}
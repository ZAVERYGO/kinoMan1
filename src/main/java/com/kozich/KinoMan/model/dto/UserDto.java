package com.kozich.KinoMan.model.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;

    private String userName;

    private String password;
}

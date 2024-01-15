package com.kozich.KinoMan.model.dto;

import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class ActorDto {

    private Long id;

    private String fistName;

    private String lastName;

    private Date dayOfBirth;

}


package com.kozich.KinoMan.model.businessObjects;

import lombok.Data;

import java.sql.Date;

@Data
public class Actor {
    private Long id;

    private String firstName;

    private String lastName;

    private Date dayOfBirth;
}

package com.kozich.KinoMan.model.businessObjects;

import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class Catalog {
    private Long id;

    private String type;

    private String name;

    private String director;

    private String country;

    private Time duration;

    private Date released;

    private String description;
}

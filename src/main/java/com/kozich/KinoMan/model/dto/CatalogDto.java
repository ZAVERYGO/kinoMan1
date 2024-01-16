package com.kozich.KinoMan.model.dto;

import com.kozich.KinoMan.model.entity.CatalogActorEntity;
import com.kozich.KinoMan.model.entity.CatalogGenreEntity;
import lombok.Data;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
public class CatalogDto {
    private Long id;

    private String type;

    private String name;

    private String director;

    private String country;

    private Time duration;

    private Date released;

    private String description;

    private List<CatalogGenreEntity> actors;

    private List<CatalogActorEntity> genres;
}

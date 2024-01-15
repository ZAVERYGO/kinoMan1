package com.kozich.KinoMan.model.dto;

import com.kozich.KinoMan.model.entity.ActorEntity;
import com.kozich.KinoMan.model.entity.CatalogActorEntity;
import com.kozich.KinoMan.model.entity.CatalogGenreEntity;
import com.kozich.KinoMan.model.entity.GenreEntity;
import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Time;
import java.util.List;

@Data
public class CatalogDto {
    private Long id;

    private String type;

    private String name;

    private String director;

    private String country;

    private Time duration;

    private Integer released;

    private String description;

    private List<CatalogGenreEntity> actors;

    private List<CatalogActorEntity> genres;
}

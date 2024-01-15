package com.kozich.KinoMan.model.dto;

import com.kozich.KinoMan.model.entity.CatalogEntity;
import com.kozich.KinoMan.model.entity.CatalogGenrePK;
import lombok.Data;


@Data
public class CatalogGenreDto {
    private CatalogGenrePK catalogGenrePkDto;

    private CatalogDto catalog;

    private GenreDto genre;
}

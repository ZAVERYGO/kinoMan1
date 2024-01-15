package com.kozich.KinoMan.model.dto;

import com.kozich.KinoMan.model.entity.CatalogEntity;
import com.kozich.KinoMan.model.entity.CatalogGenrePK;
import lombok.Data;


@Data
public class CatalogGenreDto {
    private CatalogGenrePkDto catalogGenrePkDto;

    private CatalogDto catalogId;

    private GenreDto genreId;
}

package com.kozich.KinoMan.model.dto;

import lombok.Data;


@Data
public class CatalogGenreDto {
    private CatalogGenrePkDto catalogGenrePkDto;

    private CatalogDto catalogId;

    private GenreDto genreId;
}

package com.kozich.KinoMan.model.dto;

import com.kozich.KinoMan.model.entity.CatalogEntity;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class GenreDto {
    private Long id;

    private String genre;
}

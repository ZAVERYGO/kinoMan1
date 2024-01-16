package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class CatalogGenrePk implements Serializable {
    @Column(name = "CATALOG_ID")
    private Long catalogId;

    @Column(name = "GENRE_ID")
    private Long genreId;
}

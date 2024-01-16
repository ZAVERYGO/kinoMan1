package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CATALOG_GENRE")
public class CatalogGenreEntity {
    @EmbeddedId
    private CatalogGenrePk catalogGenrePK;

    @ManyToOne
    @MapsId("catalogId")
    @JoinColumn(name = "CATALOG_ID")
    private CatalogEntity catalogId;

    @ManyToOne
    @MapsId("genreId")
    @JoinColumn(name = "GENRE_ID")
    private GenreEntity genreId;
}

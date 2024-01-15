package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "CATALOG_GENRE")
public class CatalogGenreEntity {
    @EmbeddedId
    private CatalogGenrePK catalogGenrePK;

    @ManyToOne
    @MapsId("catalogId")
    @JoinColumn(name = "CATALOG_ID")
    private CatalogEntity catalogId;

    @ManyToOne
    @MapsId("genreId")
    @JoinColumn(name = "GENRE_ID")
    private GenreEntity genreId;
}

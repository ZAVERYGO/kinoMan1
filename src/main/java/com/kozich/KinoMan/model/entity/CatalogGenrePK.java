package com.kozich.KinoMan.model.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class CatalogGenrePK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "CATALOG_ID")
    private CatalogEntity catalog;
    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private GenreEntity genre;
}

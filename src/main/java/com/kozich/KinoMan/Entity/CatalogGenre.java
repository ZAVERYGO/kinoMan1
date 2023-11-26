package com.kozich.KinoMan.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CATALOG_GENRE")
public class CatalogGenre {
    @ManyToOne
    @JoinColumn(name = "CATALOG_ID")
    public Catalog catalog;
    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    public Genre genre;

}

package com.kozich.KinoMan.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "CATALOG_GENRE")
public class CatalogGenreEntity {
    @EmbeddedId
    private CatalogGenrePK catalogGenrePK;
}

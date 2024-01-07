
package com.kozich.KinoMan.model.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "CATALOG_ACTOR")
public class CatalogActorEntity {
    @EmbeddedId
    private CatalogActorPK catalogActorPK;
}


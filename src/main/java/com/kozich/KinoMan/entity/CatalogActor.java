package com.kozich.KinoMan.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "CATALOG_ACTOR")
public class CatalogActor {
    @EmbeddedId
    private CatalogActorPK catalogActorPK;
}

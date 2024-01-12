
package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "CATALOG_ACTOR")
public class CatalogActorEntity {
    @EmbeddedId
    private CatalogActorPK catalogActorPK;

    @ManyToOne
    @MapsId("catalogId")
    @JoinColumn(name = "CATALOG_ID")
    private CatalogEntity catalog;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "ACTOR_ID")
    private ActorEntity actor;
}


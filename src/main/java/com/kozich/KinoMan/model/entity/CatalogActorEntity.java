
package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CATALOG_ACTOR")
public class CatalogActorEntity {
    @EmbeddedId
    private CatalogActorPk catalogActorPk;

    @ManyToOne
    @MapsId("catalogId")
    @JoinColumn(name = "CATALOG_ID")
    private CatalogEntity catalogId;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "ACTOR_ID")
    private ActorEntity actorId;

}


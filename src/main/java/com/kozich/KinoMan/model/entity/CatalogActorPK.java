
package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
@Table(name = "CATALOG_ACTOR")
public class CatalogActorPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "catalog_ID")
    private CatalogEntity catalog;
    @ManyToOne
    @JoinColumn(name = "actor_ID")
    private ActorEntity actor;
}


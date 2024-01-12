
package com.kozich.KinoMan.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
public class CatalogActorPK implements Serializable {
    @Column(name = "catalog_ID")
    private Long catalogId;

    @Column(name = "actor_ID")
    private Long actorId;
}


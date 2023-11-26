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
@Table(name = "CATALOG_ACTOR")
public class CatalogActor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "CATALOG_ID")
    public Catalog catalog;
    @ManyToOne
    @JoinColumn(name = "ACTOR_ID")
    public Actor actor;

}

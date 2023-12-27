package com.kozich.KinoMan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.xml.catalog.Catalog;
import java.io.Serializable;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Embeddable
public class CatalogActorPK implements Serializable {
    @Column(name = "catalog_ID")
    private Long catalogID;
    @Column(name = "catalog_ID")
    private Long actorID;

}

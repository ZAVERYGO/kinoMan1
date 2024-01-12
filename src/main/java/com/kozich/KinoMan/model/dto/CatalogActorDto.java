package com.kozich.KinoMan.model.dto;

import lombok.Data;

@Data
public class CatalogActorDto {

    private CatalogDto catalogActorPK;

    private CatalogDto catalog;

    private ActorDto actor;
}

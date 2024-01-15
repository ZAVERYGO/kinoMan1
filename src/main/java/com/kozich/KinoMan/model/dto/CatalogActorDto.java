package com.kozich.KinoMan.model.dto;

import lombok.Data;

@Data
public class CatalogActorDto {

    private CatalogDto catalogActorPkDto;

    private CatalogDto catalog;

    private ActorDto actor;
}

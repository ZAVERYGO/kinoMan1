package com.kozich.KinoMan.model.dto;

import lombok.Data;

@Data
public class CatalogActorDto {

    private CatalogActorPkDto catalogActorPkDto;

    private CatalogDto catalogId;

    private ActorDto actorId;
}

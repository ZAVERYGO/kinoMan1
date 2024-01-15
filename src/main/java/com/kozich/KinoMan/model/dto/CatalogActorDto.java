package com.kozich.KinoMan.model.dto;

import lombok.Data;

@Data
public class CatalogActorDto {

    private Long catalogActorPkDto;

    private CatalogDto catalogId;

    private ActorDto actorId;
}

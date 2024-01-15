package com.kozich.KinoMan.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CatalogActorPkDto {

    private Long catalogId;

    private Long actorId;
}

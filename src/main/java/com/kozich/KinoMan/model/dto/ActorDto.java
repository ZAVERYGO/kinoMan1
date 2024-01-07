package com.kozich.KinoMan.model.dto;

import com.kozich.KinoMan.model.entity.CatalogEntity;
import lombok.Data;

import java.util.List;

@Data
public class ActorDto {

    private Long id;

    private String fistName;

    private String lastName;

    private String dayOfBirth;

    private List<CatalogDto> catalog;


}


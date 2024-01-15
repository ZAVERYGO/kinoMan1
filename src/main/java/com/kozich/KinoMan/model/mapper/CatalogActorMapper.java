package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.CatalogActorDto;
import com.kozich.KinoMan.model.entity.CatalogActorEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CatalogActorMapper {
    CatalogActorDto catalogActorEntityToCatalogActorDto(CatalogActorEntity catalogActorEntity);

    CatalogActorEntity catalogActorDtoToCatalogActorEntity(CatalogActorDto catalogActorDto);
}

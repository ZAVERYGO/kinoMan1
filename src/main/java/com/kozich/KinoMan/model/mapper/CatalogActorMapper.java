package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.CatalogActorDto;
import com.kozich.KinoMan.model.entity.CatalogActorEntity;
import com.kozich.KinoMan.model.entity.CatalogActorPk;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {CatalogMapper.class, ActorMapper.class})
public interface CatalogActorMapper {
    CatalogActorDto catalogActorEntityToCatalogActorDto(CatalogActorEntity catalogActorEntity);

    CatalogActorEntity catalogActorDtoToCatalogActorEntity(CatalogActorDto catalogActorDto);
}

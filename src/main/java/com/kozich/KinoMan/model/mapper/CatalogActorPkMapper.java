package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.CatalogActorPkDto;
import com.kozich.KinoMan.model.entity.CatalogActorPk;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {CatalogMapper.class, ActorMapper.class})
public interface CatalogActorPkMapper {
    CatalogActorPkDto CatalogActorPkToCatalogActorPkDto(CatalogActorPk catalogActorPk);

    CatalogActorPk CatalogActorPkDtoToCatalogActorPk(CatalogActorPkDto catalogActorPk);
}

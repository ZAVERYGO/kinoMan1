package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.businessObjects.Actor;
import com.kozich.KinoMan.model.businessObjects.Catalog;
import com.kozich.KinoMan.model.dto.ActorDto;
import com.kozich.KinoMan.model.dto.CatalogDto;
import com.kozich.KinoMan.model.entity.ActorEntity;
import com.kozich.KinoMan.model.entity.CatalogEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CatalogMapper {
    Catalog catalogEntityToCatalog(CatalogEntity catalogEntity);

    CatalogDto catalogToCatalogDto(Catalog catalog);

    Catalog catalogDtoToCatalog(CatalogDto catalogDto);

    CatalogEntity catalogToCatalogEntity(Catalog catalog);
}

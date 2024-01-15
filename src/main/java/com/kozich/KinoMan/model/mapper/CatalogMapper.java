package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.CatalogDto;
import com.kozich.KinoMan.model.entity.CatalogEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CatalogMapper {
    CatalogDto catalogEntityToCatalogDto(CatalogEntity catalogEntity);
    CatalogEntity catalogDtoToCatalogEntity(CatalogDto catalogDto);
}

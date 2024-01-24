package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.businessObjects.Catalog;
import com.kozich.KinoMan.model.dto.CatalogDto;
import com.kozich.KinoMan.model.entity.CatalogEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = CatalogMapper.class)
public interface CatalogListMapper {
    List<Catalog> catalogEntityListToCatalogList(List<CatalogEntity> catalogEntity);

    List<CatalogDto> catalogListToCatalogDtoList(List<Catalog> catalog);

    List<Catalog> catalogDtoListToCatalogList(List<CatalogDto> catalogDto);

    List<CatalogEntity> catalogListToCatalogEntityList(List<Catalog> catalog);
}

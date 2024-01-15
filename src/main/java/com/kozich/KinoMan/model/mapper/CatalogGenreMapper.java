package com.kozich.KinoMan.model.mapper;


import com.kozich.KinoMan.model.dto.CatalogActorDto;
import com.kozich.KinoMan.model.dto.CatalogGenreDto;
import com.kozich.KinoMan.model.entity.CatalogActorEntity;
import com.kozich.KinoMan.model.entity.CatalogGenreEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CatalogGenreMapper {
    CatalogGenreDto catalogGenreEntityToCatalogGenreDto(CatalogGenreEntity catalogGenreEntity);

    CatalogGenreEntity catalogGenreDtoToCatalogGenreEntity(CatalogGenreDto catalogGenreDto);
}

package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.GenreDto;
import com.kozich.KinoMan.model.entity.GenreEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GenreMapper {

    GenreDto genreEntityToGenreDto(GenreEntity genreEntity);
    GenreEntity genreDtoToGenreEntity(GenreDto genreDto);
}

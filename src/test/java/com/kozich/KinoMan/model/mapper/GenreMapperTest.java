package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.GenreDto;
import com.kozich.KinoMan.model.entity.GenreEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GenreMapperTest {

    @Autowired
    private GenreMapper genreMapper;

    @Test
    void actorEntityToActorDto() {
        GenreEntity genreEntity = new GenreEntity();
        genreEntity.setId(1L);
        genreEntity.setGenre("fantasy");

        GenreDto genreDto = genreMapper.genreEntityToGenreDto(genreEntity);

        Assertions.assertNotNull(genreDto);
        Assertions.assertEquals(genreEntity.getId(), genreDto.getId());
        Assertions.assertEquals(genreEntity.getGenre(), genreDto.getGenre());
    }

    @Test
    void actorDtoToActorEntity() {
        GenreDto genreDto = new GenreDto();
        genreDto.setId(1L);
        genreDto.setGenre("fantasy");

        GenreEntity genreEntity = genreMapper.genreDtoToGenreEntity(genreDto);

        Assertions.assertNotNull(genreEntity);
        Assertions.assertEquals(genreDto.getId(), genreEntity.getId());
        Assertions.assertEquals(genreDto.getGenre(), genreEntity.getGenre());
    }
}
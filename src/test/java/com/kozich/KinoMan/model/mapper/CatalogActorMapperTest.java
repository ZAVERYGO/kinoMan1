package com.kozich.KinoMan.model.mapper;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.sql.Time;


@SpringBootTest
class CatalogActorMapperTest {

    /*@Autowired
    CatalogActorMapper catalogActorMapper;

    @Test
    void catalogActorEntityToCatalogActorDto() {
        CatalogEntity catalogEntity = new CatalogEntity();
        catalogEntity.setId(1L);
        catalogEntity.setType("TYPE");
        catalogEntity.setName("NAME");
        catalogEntity.setDirector("DIRECTOR");
        catalogEntity.setCountry("COUNTRY");
        catalogEntity.setDuration(Time.valueOf("02:22:34"));
        catalogEntity.setReleased(Date.valueOf("1996-12-24"));

        ActorEntity actorEntity = new ActorEntity();
        actorEntity.setId(2L);
        actorEntity.setFirstName("Nikita");
        actorEntity.setLastName("Kozich");

        *//*CatalogActorPk catalogActorPk = new CatalogActorPk();
        catalogActorPk.setCatalogId(1L);
        catalogActorPk.setActorId(2L);*//*

        CatalogActorEntity catalogActorEntity = new CatalogActorEntity();
        catalogActorEntity.setCatalogId(catalogEntity);
        catalogActorEntity.setActorId(actorEntity);
        //catalogActorEntity.setCatalogActorPk(catalogActorPk);

        CatalogActorDto catalogActorDto = catalogActorMapper.catalogActorEntityToCatalogActorDto(catalogActorEntity);

        Assertions.assertNotNull(catalogActorDto);
        Assertions.assertEquals(catalogActorEntity.getCatalogId().getId(), catalogActorDto.getCatalogId().getId());
        Assertions.assertEquals(catalogActorEntity.getCatalogId().getType(), catalogActorDto.getCatalogId().getType());
        Assertions.assertEquals(catalogActorEntity.getCatalogId().getName(), catalogActorDto.getCatalogId().getName());
        Assertions.assertEquals(catalogActorEntity.getCatalogId().getDirector(), catalogActorDto.getCatalogId().getDirector());
        Assertions.assertEquals(catalogActorEntity.getCatalogId().getCountry(), catalogActorDto.getCatalogId().getCountry());
        Assertions.assertEquals(catalogActorEntity.getCatalogId().getDuration(), catalogActorDto.getCatalogId().getDuration());
        Assertions.assertEquals(catalogActorEntity.getCatalogId().getReleased(), catalogActorDto.getCatalogId().getReleased());

        Assertions.assertEquals(catalogActorEntity.getActorId().getId(), catalogActorDto.getActorId().getId());
        Assertions.assertEquals(catalogActorEntity.getActorId().getFirstName(), catalogActorDto.getActorId().getFirstName());
        Assertions.assertEquals(catalogActorEntity.getActorId().getLastName(), catalogActorDto.getActorId().getLastName());
        Assertions.assertEquals(catalogActorEntity.getActorId().getDayOfBirth(), catalogActorDto.getActorId().getDayOfBirth());

        *//*Assertions.assertEquals(catalogActorEntity.getCatalogActorPk().getActorId(), catalogActorDto.getCatalogActorPkDto().getActorId());
        Assertions.assertEquals(catalogActorEntity.getCatalogActorPk().getCatalogId(), catalogActorDto.getCatalogActorPkDto().getCatalogId());*//*
    }
*/
    @Test
    void catalogActorDtoToCatalogActorEntity() {
    }
}
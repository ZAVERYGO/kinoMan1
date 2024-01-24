package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.ActorDto;
import com.kozich.KinoMan.model.entity.ActorEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

@SpringBootTest
class ActorMapperTest {

    @Autowired
    private ActorMapper actorMapper;

    @Test
    void actorEntityToActorDto() {
        ActorEntity actorEntity = new ActorEntity().
                setId(1L).
                setFirstName("Nikita").
                setLastName("Kozich").
                setDayOfBirth(Date.valueOf("2004-04-14"));

        /*ActorDto actorDto = actorMapper.actorEntityToActorDto(actorEntity);

        Assertions.assertAll(
                () -> Assertions.assertEquals(actorEntity.getId(), actorDto.getId()),
                () -> Assertions.assertEquals(actorEntity.getFirstName(), actorDto.getFirstName()),
                () -> Assertions.assertEquals(actorEntity.getLastName(), actorDto.getLastName()),
                () -> Assertions.assertEquals(actorEntity.getDayOfBirth(), actorDto.getDayOfBirth())
        );*/
    }

    @Test
    void actorDtoToActorEntity() {
        ActorDto actorDto = new ActorDto();
        actorDto.setId(1L);
        actorDto.setFirstName("Nikita");
        actorDto.setLastName("Kozich");
        actorDto.setDayOfBirth(Date.valueOf("2004-04-14"));

        //ActorEntity actorEntity = actorMapper.actorDtoToActorEntity(actorDto);

        /*Assertions.assertNotNull(actorDto);
        Assertions.assertEquals(actorDto.getId(), actorEntity.getId());
        Assertions.assertEquals(actorDto.getFirstName(), actorEntity.getFirstName());
        Assertions.assertEquals(actorDto.getLastName(), actorEntity.getLastName());
        Assertions.assertEquals(actorDto.getDayOfBirth(), actorEntity.getDayOfBirth());*/
    }
}
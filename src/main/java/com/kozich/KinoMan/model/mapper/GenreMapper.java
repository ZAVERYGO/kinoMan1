package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.ActorDto;
import com.kozich.KinoMan.model.entity.ActorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreMapper {
    ActorEntity ActorDtoToActorEntity(ActorDto actorDto);
}

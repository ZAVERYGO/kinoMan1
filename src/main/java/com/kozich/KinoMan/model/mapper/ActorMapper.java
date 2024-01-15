package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.ActorDto;
import com.kozich.KinoMan.model.entity.ActorEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ActorMapper {
    ActorDto actorEntityToActorDto(ActorEntity actorEntity);

    ActorEntity actorDtoToActorEntity(ActorDto actorDto);
}

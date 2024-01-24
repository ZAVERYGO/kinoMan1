package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.businessObjects.Actor;
import com.kozich.KinoMan.model.dto.ActorDto;
import com.kozich.KinoMan.model.entity.ActorEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ActorMapper {
    Actor actorEntityToActor(ActorEntity actorEntity);

    ActorDto actorToActorDto(Actor actor);

    Actor actorDtoToActor(ActorDto actorDto);

    ActorEntity actorToActorEntity(Actor actor);
}

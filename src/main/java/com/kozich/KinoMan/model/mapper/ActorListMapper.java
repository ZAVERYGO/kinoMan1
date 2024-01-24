package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.businessObjects.Actor;
import com.kozich.KinoMan.model.dto.ActorDto;
import com.kozich.KinoMan.model.entity.ActorEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = ActorMapper.class)
public interface ActorListMapper {

    List<Actor> actorEntityListToActorList(List<ActorEntity> actorEntity);

    List<ActorDto> actorListToActorDtoList(List<Actor> actor);

    List<Actor> actorDtoListToActorList(List<ActorDto> actorDto);

    List<ActorEntity> actorListToActorEntityList(List<Actor> actor);
}

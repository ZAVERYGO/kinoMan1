package com.kozich.KinoMan.model.mapper;

import com.kozich.KinoMan.model.dto.ActorDto;
import com.kozich.KinoMan.model.entity.ActorEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ActorMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ActorListMapper {
    List<ActorDto> actorEntityListToActorDtoList(List<ActorEntity> actorEntity);

    List<ActorEntity> actorDtoToActorEntity(List<ActorDto> actorDto);
}

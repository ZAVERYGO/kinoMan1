package com.kozich.KinoMan.model.service;

import com.kozich.KinoMan.model.entity.ActorEntity;

import java.util.List;

public interface ActorService {
    List<ActorEntity> getAllActor();

    ActorEntity getActorByFirstNameAndLastName(String firstName, String lastName);

    List<ActorEntity> getActorByMovie(String name);
}

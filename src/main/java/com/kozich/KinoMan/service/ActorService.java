package com.kozich.KinoMan.service;

import com.kozich.KinoMan.entity.ActorEntity;
import com.kozich.KinoMan.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository actorRepository;
    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<ActorEntity> getAllActor(){
        return actorRepository.findAll();
    }

}

package com.kozich.KinoMan.service.serviceImpl;

import com.kozich.KinoMan.entity.ActorEntity;
import com.kozich.KinoMan.repository.ActorRepository;
import com.kozich.KinoMan.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;
    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<ActorEntity> getAllActor() {
        return actorRepository.findAll();
    }
}

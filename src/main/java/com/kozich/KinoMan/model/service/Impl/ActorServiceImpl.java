package com.kozich.KinoMan.model.service.Impl;

import com.kozich.KinoMan.model.entity.ActorEntity;
import com.kozich.KinoMan.model.service.ActorService;
import com.kozich.KinoMan.repository.ActorRepository;
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

    @Override
    public ActorEntity getActorByFirstNameAndLastName(String firstName, String lastName) {
        String firstNameValid = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastNameValid = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        return actorRepository.findByFirstNameAndLastName(firstNameValid, lastNameValid);
    }

    @Override
    public List<ActorEntity> getActorByMovie(String name) {
        String nameValid = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        return actorRepository.findByMovie(nameValid);
    }
}
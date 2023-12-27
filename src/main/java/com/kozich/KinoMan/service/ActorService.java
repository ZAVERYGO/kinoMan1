package com.kozich.KinoMan.service;

import com.kozich.KinoMan.entity.ActorEntity;
import com.kozich.KinoMan.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ActorService {
    List<ActorEntity> getAllActor();
}

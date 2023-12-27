package com.kozich.KinoMan.service.serviceImpl;

import com.kozich.KinoMan.repository.ActorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ActorServiceImplTest {

    @Autowired
    private ActorRepository actorRepository;
    @Test
    void getAllActor() {
        Assertions.assertNotNull(actorRepository.findAll());
    }
}
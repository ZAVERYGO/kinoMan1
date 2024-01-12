package com.kozich.KinoMan.model.service.Impl;

import com.kozich.KinoMan.model.entity.ActorEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ActorServiceImplTest {

    private ActorServiceImpl actorService;

    /*@BeforeEach
    public void setUp(){
        ActorServiceImpl actorService1 = new ActorServiceImpl();
    }*/
    @Test
    void getAllActor() {
        List<ActorEntity> allActor = actorService.getAllActor();
        assertNotNull(allActor);
        assertEquals(4, allActor.size());
    }

}
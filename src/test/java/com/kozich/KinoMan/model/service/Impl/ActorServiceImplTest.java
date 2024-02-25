package com.kozich.KinoMan.model.service.Impl;

import com.kozich.KinoMan.model.entity.ActorEntity;
import com.kozich.KinoMan.repository.ActorRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ActorServiceImplTest {

    @InjectMocks
    private ActorServiceImpl actorService;

    @Mock
    private ActorRepository actorRepository;


    static ActorEntity actorEntity1;
    static ActorEntity actorEntity2;
    @BeforeAll
    static void setUp(){
        actorEntity1 = new ActorEntity();
        actorEntity2 = new ActorEntity();
    }

    @Test
    void getAllActor() {
        Mockito.when(actorRepository.findAll()).thenReturn(List.of(actorEntity1, actorEntity2));
        List<ActorEntity> allActor = actorService.getAllActor();
        assertEquals(2, allActor.size());
    }

    @Test
    void getActorByFirstNameAndLastName() {
        Mockito.when(actorRepository.findByFirstNameAndLastName("Nikita", "Kozich")).thenReturn(actorEntity1);
        ActorEntity actor = actorService.getActorByFirstNameAndLastName("Nikita", "Kozich");
        assertNotNull(actor);
        assertEquals(actorEntity1, actor);
    }

    @Test
    void getActorByMovie() {
    }
}
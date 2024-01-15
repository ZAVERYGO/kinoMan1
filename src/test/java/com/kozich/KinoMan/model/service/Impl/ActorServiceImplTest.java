package com.kozich.KinoMan.model.service.Impl;

import com.kozich.KinoMan.model.entity.ActorEntity;
import com.kozich.KinoMan.repository.ActorRepository;
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

    @Test
    void getAllActor() {
        ActorEntity actorEntity1 = new ActorEntity();
        ActorEntity actorEntity2 = new ActorEntity();
        Mockito.when(actorRepository.findAll()).thenReturn(List.of(actorEntity1, actorEntity2));
        List<ActorEntity> allActor = actorService.getAllActor();
        assertNotNull(allActor);
        assertEquals(2, allActor.size());
    }
}
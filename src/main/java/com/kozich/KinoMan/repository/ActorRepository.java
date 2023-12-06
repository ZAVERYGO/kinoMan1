package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.entity.ActorEntity;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<ActorEntity, Long> {
}

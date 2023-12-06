package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.entity.ActorEntity;
import com.kozich.KinoMan.entity.GenreEntity;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<GenreEntity, Long> {

}

package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.entity.ActorEntity;
import com.kozich.KinoMan.entity.CatalogEntity;
import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {
}

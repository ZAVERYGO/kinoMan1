package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.model.entity.CatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {

    @Query("select c.catalogId from CatalogActorEntity c where c.actorId.firstName=:firstName and c.actorId.lastName=:lastName")
    List<CatalogEntity> findByActor(String firstName, String lastName);
}

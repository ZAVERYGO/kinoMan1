package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.model.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, Long> {
    ActorEntity findByFirstNameAndLastName(String firstName, String lastName);
    //@Query("select a from CatalogActorEntity c join c.actorId a on c.catalogId.name =:name")
    @Query("select c.actorId from CatalogActorEntity c where c.catalogId.name=:name")
    List<ActorEntity> findByMovie(@Param("name") String name);



}

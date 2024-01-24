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

    //нерабочие
    //@Query(value = "SELECT first_Name from actor where actor.actor_id = (SELECT actor_id from catalog_actor WHERE catalog_actor.catalog_id = (SELECT name from catalog WHERE name =:name))", nativeQuery = true)
    //@Query("select e from CatalogActorEntity e where e.catalogId.name = :name")
    //@Query("select a from (select c, a from CatalogActorEntity c, ActorEntity a WHERE c.actorId.id = a.id) where c.catalogId.name = :name")

    //рабочие
    //@Query("select a from CatalogActorEntity c join c.actorId a on c.catalogId.name =:name")
    @Query("select c.actorId from CatalogActorEntity c where c.catalogId.name=:name")
    List<ActorEntity> findByMovie(@Param("name") String name);


}

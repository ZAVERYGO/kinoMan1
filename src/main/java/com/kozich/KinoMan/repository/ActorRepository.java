package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.model.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, Long> {
}

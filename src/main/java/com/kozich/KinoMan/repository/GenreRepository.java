package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {

}

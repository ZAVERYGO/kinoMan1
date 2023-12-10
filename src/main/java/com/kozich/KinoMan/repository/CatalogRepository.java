package com.kozich.KinoMan.repository;

import com.kozich.KinoMan.entity.CatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
}

package com.kozich.KinoMan.model.service;

import com.kozich.KinoMan.model.entity.CatalogEntity;

import java.util.List;

public interface CatalogService {
    List<CatalogEntity> getMoviesByActor(String firstName, String lastName);
}

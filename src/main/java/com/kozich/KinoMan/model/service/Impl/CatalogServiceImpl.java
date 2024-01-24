package com.kozich.KinoMan.model.service.Impl;

import com.kozich.KinoMan.model.entity.CatalogEntity;
import com.kozich.KinoMan.model.service.CatalogService;
import com.kozich.KinoMan.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    @Autowired
    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public List<CatalogEntity> getMoviesByActor(String firstName, String lastName) {
        String firstNameValid = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String lastNameValid = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        return catalogRepository.findByActor(firstNameValid, lastNameValid);
    }
}

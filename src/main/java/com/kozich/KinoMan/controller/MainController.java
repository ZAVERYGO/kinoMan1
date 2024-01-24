package com.kozich.KinoMan.controller;

import com.kozich.KinoMan.model.mapper.ActorListMapper;
import com.kozich.KinoMan.model.mapper.ActorMapper;
import com.kozich.KinoMan.model.mapper.CatalogListMapper;
import com.kozich.KinoMan.model.mapper.CatalogMapper;
import com.kozich.KinoMan.model.service.Impl.ActorServiceImpl;
import com.kozich.KinoMan.model.service.Impl.CatalogServiceImpl;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Data
public class MainController {

    private final ActorServiceImpl actorService;
    private final ActorListMapper actorListMapper;
    private final ActorMapper actorMapper;

    private final CatalogServiceImpl catalogService;
    private final CatalogMapper catalogMapper;
    private final CatalogListMapper catalogListMapper;

    @Autowired
    public MainController(ActorServiceImpl actorService, ActorListMapper actorListMapper, ActorMapper actorMapper, CatalogServiceImpl catalogService, CatalogMapper catalogMapper, CatalogListMapper catalogListMapper) {
        this.actorService = actorService;
        this.actorListMapper = actorListMapper;
        this.actorMapper = actorMapper;
        this.catalogService = catalogService;
        this.catalogMapper = catalogMapper;
        this.catalogListMapper = catalogListMapper;
    }

    @GetMapping("/actors")
    public String getActors(Model model){
        model.addAttribute("actors", actorListMapper.actorListToActorDtoList(actorListMapper.actorEntityListToActorList(actorService.getAllActor())));
        return "actors";
    }

    @GetMapping("/actor")
    public String getActorByName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, Model model){
        model.addAttribute("actors", actorMapper.actorToActorDto(actorMapper.actorEntityToActor(actorService.getActorByFirstNameAndLastName(firstName, lastName))));
        return "actors";
    }
    @GetMapping("/actorsByMovie")
    public String getActorsByMovie(@RequestParam("name") String name, Model model){
        model.addAttribute("actors", actorListMapper.actorListToActorDtoList(actorListMapper.actorEntityListToActorList(actorService.getActorByMovie(name))));
        return "actors";
    }

    @GetMapping("/moviesByActor")
    public String getMoviesByActor(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, Model model){
        model.addAttribute("movies", catalogListMapper.catalogListToCatalogDtoList(catalogListMapper.catalogEntityListToCatalogList(catalogService.getMoviesByActor(firstName, lastName))));
        return "movies";
    }
}

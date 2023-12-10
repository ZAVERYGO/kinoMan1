package com.kozich.KinoMan.controller;

import com.kozich.KinoMan.entity.ActorEntity;
import com.kozich.KinoMan.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    private final ActorService actorService;

    @Autowired
    public MainController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/main")
    public String getMain(Model model){

        return "main";
    }
    @GetMapping("/actors")
    public String getActors(Model model){
        //List<ActorEntity> allActor = actorService.getAllActor();
        model.addAttribute("actors", actorService.getAllActor());
        return "actors";
    }
}

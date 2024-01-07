package com.kozich.KinoMan.controller;

import com.kozich.KinoMan.model.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final ActorService actorService;

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

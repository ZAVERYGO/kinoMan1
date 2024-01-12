package com.kozich.KinoMan.controller;

import com.kozich.KinoMan.model.service.Impl.ActorServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
public class MainController {

    private final ActorServiceImpl actorService;

    @Autowired
    public MainController(ActorServiceImpl actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/main")
    public String getMain(Model model){

        return "main";
    }
    @GetMapping("/actors")
    public String getActors(Model model){
        model.addAttribute("actors", actorService.getAllActor());
        return "actors";
    }
}

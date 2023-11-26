package com.kozich.KinoMan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class Main {
    @GetMapping("/us")
    public String ggg(){
        return "ra";
    }
}

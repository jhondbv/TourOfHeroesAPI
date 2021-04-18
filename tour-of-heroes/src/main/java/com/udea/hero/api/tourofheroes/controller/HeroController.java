package com.udea.hero.api.tourofheroes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class HeroController {
    
    public HeroController(){}

    @GetMapping()
    public String getHero()
    {
        return "Hola mundo";

    }

}

package com.udea.hero.api.tourofheroes.controller;

import com.udea.hero.api.tourofheroes.dto.HeroDto;

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
    
    public String getHero(int id)
    {
        return "hola mundo";
    }
    
    public String getHeroNo404(int id )
    {
        return "";
    }

    public String searchHeroes(String term)
    {
        return "";
    }

    public void UpdateHero(HeroDto hero)
    {

    }

    public void addHero(HeroDto hero)
    {}

    public void deletehero(HeroDto hero)
    {}


}

package com.udea.hero.api.tourofheroes.controller;

import java.util.ArrayList;
import java.util.List;

import com.udea.hero.api.tourofheroes.dto.HeroDto;
import com.udea.hero.api.tourofheroes.model.Hero;
import com.udea.hero.api.tourofheroes.service.HeroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class HeroController {
    HeroService service;
 
    @Autowired
    public HeroController(HeroService heroService){
        service = heroService;
    }

    @GetMapping()
    public List<Hero> getHero()
    {
        List<Hero> heroes = service.getHeroes();
        return heroes;

    }
    
    public HeroDto getHero(int id)
    {
        return new HeroDto(id,"Super Man");
    }
    
    public String getHeroNo404(int id )
    {
        return "";
    }

    public List<HeroDto> searchHeroes(String term)
    {
        return new ArrayList<HeroDto>();
    }

    public void UpdateHero(HeroDto hero)
    {

    }

    public void addHero(HeroDto hero)
    {}

    public void deletehero(HeroDto hero)
    {}


}

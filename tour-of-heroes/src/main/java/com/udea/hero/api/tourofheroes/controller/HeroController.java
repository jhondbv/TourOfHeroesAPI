package com.udea.hero.api.tourofheroes.controller;

import java.util.ArrayList;
import java.util.List;

import com.udea.hero.api.tourofheroes.dto.HeroDto;
import com.udea.hero.api.tourofheroes.model.Hero;
import com.udea.hero.api.tourofheroes.service.HeroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @GetMapping("{id}")
    public ResponseEntity<Hero> getHero(@PathVariable Integer id)
    {
        return ResponseEntity.ok(service.getHero(id)) ;
    }
    
    public String getHeroNo404(Integer id )
    {
        return "";
    }

    public List<Hero> searchHeroes(String term)
    {
        return new ArrayList<Hero>();
    }

    @PutMapping
    public void UpdateHero(Hero hero)
    {
        service.createorUpdateHero(hero);
    }

    @PostMapping
    public void addHero(@RequestBody Hero hero)
    {
        service.createorUpdateHero(hero);
    }

    public void deletehero( Hero hero)
    {}


}

package com.udea.hero.api.tourofheroes.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.udea.hero.api.tourofheroes.model.Hero;
import com.udea.hero.api.tourofheroes.service.HeroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    public List<Hero> getHeroes()
    {
        List<Hero> heroes = service.getHeroes();
        return heroes;

    }
    
    @GetMapping("{id}")
    public ResponseEntity<Hero> getHero(@PathVariable Integer id)
    {
        return ResponseEntity.ok(service.getHero(id)) ;
    }
    
    @RequestMapping("consultar404")
    public String getHeroNo404(Integer id )
    {
        return "";
    }

    @RequestMapping("buscar")
    public ResponseEntity<List<Hero>> searchHeroes(String term)
    {
        return ResponseEntity.ok(service.getHeroes());
    }

    @PutMapping
    @RequestMapping("actualizar")
    public void updateHero(@RequestBody Hero hero)
    {
        Hero Ohero = service.getHero(hero.getId());
        
            Ohero.setName(hero.getName());
        service.createorUpdateHero(hero);
    }

    @PostMapping
    @RequestMapping("crear")
    public void addHero(@RequestBody Hero hero)
    {
        service.createorUpdateHero(hero);
    }

    @DeleteMapping
    @RequestMapping("borrar")
    public void deletehero( Hero hero)
    {
        service.deleteHero(hero);
    }


}

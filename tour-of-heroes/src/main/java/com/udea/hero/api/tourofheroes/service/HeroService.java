package com.udea.hero.api.tourofheroes.service;

import java.util.List;

import com.udea.hero.api.tourofheroes.model.Hero;
import com.udea.hero.api.tourofheroes.repository.IHeroRepository;

import org.springframework.stereotype.Service;

@Service
public class HeroService {

    private IHeroRepository heroRepository;

    public HeroService(IHeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public Hero getHero(Integer id) {
        return heroRepository.findById(id).get();
    }

    public List<Hero> getHeroes() {
        return heroRepository.findAll();
    }

    public void createorUpdateHero(Hero hero)
    {
        heroRepository.save(hero);
    }

  
}

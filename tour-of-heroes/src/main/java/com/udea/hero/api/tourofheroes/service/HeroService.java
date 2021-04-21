package com.udea.hero.api.tourofheroes.service;

import java.util.List;
import java.util.Optional;

import com.udea.hero.api.tourofheroes.exception.BusinessException;
import com.udea.hero.api.tourofheroes.model.Hero;
import com.udea.hero.api.tourofheroes.repository.IHeroRepository;
import com.udea.hero.api.tourofheroes.util.Messages;

import org.springframework.stereotype.Service;

@Service
public class HeroService {

    private IHeroRepository heroRepository;
    private Messages message ;

    public HeroService(IHeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public Hero getHero(Integer id) {
        Optional<Hero> hero =heroRepository.findById(id);
        if(!hero.isPresent())
            {throw new BusinessException(message.get("exception.data_not_found.hero"));}
        return hero.get();
    }

    public List<Hero> getHeroes() {
        return heroRepository.findAll();
    }

    public List<Hero> search(String term) {
        return heroRepository.findAll();
    }

    public void createorUpdateHero(Hero hero)
    {
        heroRepository.save(hero);
    }

    public void deleteHero(Hero hero)
    {
        Optional<Hero> Ohero =heroRepository.findById(hero.getId());
        if(!Ohero.isPresent())
            {throw new BusinessException(message.get("exception.data_not_found.hero"));}
        heroRepository.deleteById(hero.getId());
    }

  
}

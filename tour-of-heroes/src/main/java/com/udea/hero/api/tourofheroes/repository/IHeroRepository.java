package com.udea.hero.api.tourofheroes.repository;
import com.udea.hero.api.tourofheroes.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHeroRepository extends JpaRepository<Hero,Integer> {
    
}

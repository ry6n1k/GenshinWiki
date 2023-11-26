package com.example.genshin.Hero.Service;

import java.util.List;
import java.util.Optional;

import com.example.genshin.Hero.Entity.Hero;

public interface HeroService {

    List<Hero> findAllHeroes();

    Optional<Hero> findById(Integer id);

    Hero saveHero(Hero hero);
}
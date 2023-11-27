package com.example.genshin.Service;

import java.util.List;
import java.util.Optional;

import com.example.genshin.Entity.Hero;

public interface HeroService {

    List<Hero> findAllHeroes();

    Optional<Hero> findById(Integer id);

    Hero saveHero(Hero hero);

    Hero updateHero(Hero hero);

    void deleteHero(Integer id);
}
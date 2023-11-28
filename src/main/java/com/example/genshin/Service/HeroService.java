package com.example.genshin.Service;

import java.util.List;
import java.util.Optional;

import com.example.genshin.Entity.Hero;

public interface HeroService {

    List<Hero> findAll();

    Optional<Hero> findById(Integer id);

    Hero save(Hero hero);

    Hero update(Hero hero);

    void delete(Integer id);
}
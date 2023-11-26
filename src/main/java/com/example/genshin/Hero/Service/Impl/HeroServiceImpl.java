package com.example.genshin.Hero.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.genshin.Hero.Entity.Hero;
import com.example.genshin.Hero.Repository.HeroRepository;
import com.example.genshin.Hero.Service.HeroService;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public List<Hero> findAllHeroes() {
        return heroRepository.findAll();
    }

    @Override
    public Optional<Hero> findById(Integer id) {
        return heroRepository.findById(id);
    }

    @Override
    public Hero saveHero(Hero hero) {
        return heroRepository.save(hero);
    }
}

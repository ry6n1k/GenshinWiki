package com.example.genshin.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.genshin.Entity.Hero;
import com.example.genshin.Repository.HeroRepository;
import com.example.genshin.Service.HeroService;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public List<Hero> findAll() {
        return heroRepository.findAll();
    }

    @Override
    public Optional<Hero> findById(Integer id) {
        return heroRepository.findById(id);
    }

    @Override
    public Hero save(Hero hero) {
        return heroRepository.save(hero);
    }

    @Override
    public Hero update(Hero hero){
        return heroRepository.save(hero);
    }

    @Override
    public void delete(Integer id){
        heroRepository.deleteById(id);
    }
}

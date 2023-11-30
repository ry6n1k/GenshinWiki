package com.example.genshin.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.genshin.Entity.Hero;
import com.example.genshin.Repository.HeroRepository;
import com.example.genshin.Service.HeroService;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository repository;

    public HeroServiceImpl(HeroRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Hero> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Hero> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Hero save(Hero hero) {
        return repository.save(hero);
    }

    @Override
    public Hero update(Hero hero){
        return repository.save(hero);
    }

    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
}

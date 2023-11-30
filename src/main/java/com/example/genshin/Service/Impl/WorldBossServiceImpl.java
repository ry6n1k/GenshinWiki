package com.example.genshin.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.genshin.Entity.WorldBoss;
import com.example.genshin.Repository.WorldBossRepository;
import com.example.genshin.Service.WorldBossService;

@Service
public class WorldBossServiceImpl implements WorldBossService {

    private final WorldBossRepository repository;

    public WorldBossServiceImpl(WorldBossRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<WorldBoss> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<WorldBoss> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public WorldBoss save(WorldBoss boss) {
        return repository.save(boss);
    }

    @Override
    public WorldBoss update(WorldBoss boss){
        return repository.save(boss);
    }

    @Override
    public void delete(Integer id){
        repository.deleteById(id);
    }
}

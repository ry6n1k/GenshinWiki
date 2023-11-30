package com.example.genshin.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.genshin.Entity.WorldBossItem;
import com.example.genshin.Repository.WorldBossItemRepository;
import com.example.genshin.Service.WorldBossItemService;

@Service
public class WorldBossItemServiceImpl implements WorldBossItemService {

    private final WorldBossItemRepository repository;

    public WorldBossItemServiceImpl(WorldBossItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<WorldBossItem> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<WorldBossItem> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public WorldBossItem save(WorldBossItem item) {
        return repository.save(item);
    }

    @Override
    public WorldBossItem update(WorldBossItem item) {
        return repository.save(item);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

package com.example.genshin.Service;

import java.util.List;
import java.util.Optional;

import com.example.genshin.Entity.WorldBoss;

public interface WorldBossService {

    List<WorldBoss> findAll();

    Optional<WorldBoss> findById(Integer id);

    WorldBoss save(WorldBoss boss);

    WorldBoss update(WorldBoss boss);

    void delete(Integer id);
}

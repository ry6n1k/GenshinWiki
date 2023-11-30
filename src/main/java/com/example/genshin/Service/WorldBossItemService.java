package com.example.genshin.Service;

import java.util.List;
import java.util.Optional;

import com.example.genshin.Entity.WorldBossItem;

public interface WorldBossItemService {

    List<WorldBossItem> findAll();

    Optional<WorldBossItem> findById(Integer id);

    WorldBossItem save(WorldBossItem item);

    WorldBossItem update(WorldBossItem item);

    void delete(Integer id);
}

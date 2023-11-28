package com.example.genshin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.genshin.Entity.WorldBossItem;

@Repository
public interface WorldBossItemRepository extends JpaRepository<WorldBossItem, Integer> {
}
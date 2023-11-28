package com.example.genshin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.genshin.Entity.WorldBoss;

@Repository
public interface WorldBossRepository extends JpaRepository<WorldBoss, Integer> {
}
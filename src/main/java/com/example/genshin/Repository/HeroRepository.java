package com.example.genshin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.genshin.Entity.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {
}
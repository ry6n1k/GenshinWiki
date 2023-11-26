package com.example.genshin.Hero.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.genshin.Hero.Entity.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {
}

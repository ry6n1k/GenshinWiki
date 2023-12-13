package com.example.genshin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.genshin.Entity.Weapon;

public interface WeaponRepository extends JpaRepository<Weapon, Integer> {
}

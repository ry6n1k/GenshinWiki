package com.example.genshin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.genshin.Entity.Talent;

@Repository
public interface TalentRepository extends JpaRepository<Talent, Integer> {
}

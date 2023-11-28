package com.example.genshin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.genshin.Entity.Element;

@Repository
public interface ElementRepository extends JpaRepository<Element, Integer> {
}
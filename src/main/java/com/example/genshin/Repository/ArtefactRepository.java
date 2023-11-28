package com.example.genshin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.genshin.Entity.Artefact;

@Repository
public interface ArtefactRepository extends JpaRepository<Artefact, Integer> {
}

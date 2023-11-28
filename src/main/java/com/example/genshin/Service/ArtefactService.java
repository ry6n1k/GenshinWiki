package com.example.genshin.Service;

import java.util.List;
import java.util.Optional;

import com.example.genshin.Entity.Artefact;

public interface ArtefactService {

    List<Artefact> findAll();

    Optional<Artefact> findById(Integer id);

    Artefact save(Artefact artefact);

    Artefact update(Artefact artefact);

    void delete(Integer id);
}

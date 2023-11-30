package com.example.genshin.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.genshin.Entity.Artefact;
import com.example.genshin.Repository.ArtefactRepository;
import com.example.genshin.Service.ArtefactService;

@Service
public class ArtefactServiceImpl implements ArtefactService {

    private final ArtefactRepository repository;

    public ArtefactServiceImpl(ArtefactRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Artefact> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Artefact> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Artefact save(Artefact artefact) {
        return repository.save(artefact);
    }

    @Override
    public Artefact update(Artefact artefact) {
        return repository.save(artefact);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
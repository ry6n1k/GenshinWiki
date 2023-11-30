package com.example.genshin.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.genshin.Entity.Talent;
import com.example.genshin.Repository.TalentRepository;
import com.example.genshin.Service.TalentService;

@Service
public class TalentServiceImpl implements TalentService {

    private final TalentRepository repository;

    public TalentServiceImpl(TalentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Talent> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Talent> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Talent save(Talent talent) {
        return repository.save(talent);
    }

    @Override
    public Talent update(Talent talent) {
        return repository.save(talent);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

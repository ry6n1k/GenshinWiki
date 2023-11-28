package com.example.genshin.Service;

import java.util.List;
import java.util.Optional;

import com.example.genshin.Entity.Talent;

public interface TalentService {
    
    List<Talent> findAll();

    Optional<Talent> findById(Integer id);

    Talent save(Talent talent);

    Talent update(Talent talent);

    void delete(Integer id);
}

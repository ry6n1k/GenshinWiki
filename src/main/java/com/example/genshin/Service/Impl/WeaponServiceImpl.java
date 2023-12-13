package com.example.genshin.Service.Impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.genshin.Entity.Weapon;
import com.example.genshin.Repository.WeaponRepository;
import com.example.genshin.Service.WeaponService;

@Service
public class WeaponServiceImpl implements WeaponService {

    private final WeaponRepository repository;

    public WeaponServiceImpl(WeaponRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Weapon> findAll() {
        return repository.findAll();
    }
}

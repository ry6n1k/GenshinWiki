package com.example.genshin.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.genshin.Entity.Weapon;
import com.example.genshin.Service.WeaponService;

@RestController
@RequestMapping("/weapon")
public class WeaponController {

    private final WeaponService service;

    public WeaponController(WeaponService service) {
        this.service = service;
    }

    @GetMapping
    public List<Weapon> findAll() {
        return service.findAll();
    }
}

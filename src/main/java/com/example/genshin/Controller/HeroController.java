package com.example.genshin.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.genshin.Entity.Hero;
import com.example.genshin.Service.HeroService;

@RestController
@RequestMapping("/hero")
public class HeroController {

    private final HeroService service;

    public HeroController(HeroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Hero> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Hero> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    // specify the type of data
    @PostMapping(consumes = { "application/json" })
    public Hero save(@RequestBody Hero hero) {
        return service.save(hero);
    }

    @PutMapping
    public Hero update(@RequestBody Hero hero) {
        return service.update(hero);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}
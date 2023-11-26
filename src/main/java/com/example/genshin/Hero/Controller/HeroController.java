package com.example.genshin.Hero.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.genshin.Hero.Entity.Hero;
import com.example.genshin.Hero.Service.HeroService;

@RestController
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public List<Hero> findAll() {
        return heroService.findAllHeroes();
    }

    @GetMapping("/{id}")
    public Optional<Hero> findHeroById(@PathVariable("id") Integer id) {
        return heroService.findById(id);
    }

    // specify the type of data
    @PostMapping(consumes = {"application/json"})
    public Hero saveHero(@RequestBody Hero hero) {
        return heroService.saveHero(hero);
    }

}
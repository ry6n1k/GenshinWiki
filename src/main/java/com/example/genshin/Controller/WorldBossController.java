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

import com.example.genshin.Entity.WorldBoss;
import com.example.genshin.Service.WorldBossService;

@RestController
@RequestMapping("/boss")
public class WorldBossController {
    private final WorldBossService service;

    public WorldBossController(WorldBossService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorldBoss> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<WorldBoss> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    // specify the type of data
    @PostMapping(consumes = { "application/json" })
    public WorldBoss save(@RequestBody WorldBoss boss) {
        return service.save(boss);
    }

    @PutMapping
    public WorldBoss update(@RequestBody WorldBoss boss) {
        return service.update(boss);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}

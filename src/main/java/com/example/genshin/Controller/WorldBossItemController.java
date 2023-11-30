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

import com.example.genshin.Entity.WorldBossItem;
import com.example.genshin.Service.WorldBossItemService;

@RestController
@RequestMapping("/item")
public class WorldBossItemController {
    private final WorldBossItemService service;

    public WorldBossItemController(WorldBossItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorldBossItem> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<WorldBossItem> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    // specify the type of data
    @PostMapping(consumes = { "application/json" })
    public WorldBossItem save(@RequestBody WorldBossItem item) {
        return service.save(item);
    }

    @PutMapping
    public WorldBossItem update(@RequestBody WorldBossItem item) {
        return service.update(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}

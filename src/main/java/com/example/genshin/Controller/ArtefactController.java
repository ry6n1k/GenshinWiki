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

import com.example.genshin.Entity.Artefact;
import com.example.genshin.Service.ArtefactService;

@RestController
@RequestMapping("/artefact")
public class ArtefactController {

    private final ArtefactService service;

    public ArtefactController(ArtefactService service) {
        this.service = service;
    }

    @GetMapping
    public List<Artefact> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Artefact> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    // specify the type of data
    @PostMapping(consumes = { "application/json" })
    public Artefact save(@RequestBody Artefact artefact) {
        return service.save(artefact);
    }

    @PutMapping
    public Artefact update(@RequestBody Artefact artefact) {
        return service.update(artefact);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}

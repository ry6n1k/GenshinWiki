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

import com.example.genshin.Entity.Talent;
import com.example.genshin.Service.TalentService;

@RestController
@RequestMapping("/talent")
public class TalentController {

    private final TalentService service;

    public TalentController(TalentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Talent> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Talent> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    // specify the type of data
    @PostMapping(consumes = { "application/json" })
    public Talent save(@RequestBody Talent talent) {
        return service.save(talent);
    }

    @PutMapping
    public Talent update(@RequestBody Talent talent) {
        return service.update(talent);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}

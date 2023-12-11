package com.example.genshin.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "world_boss")
public class WorldBoss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "boss", cascade = CascadeType.PERSIST, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("boss")
    private List<WorldBossItem> items;

    public WorldBoss() {
    }

    public WorldBoss(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WorldBossItem> getItems() {
        return items;
    }

    public void setItems(List<WorldBossItem> items) {
        this.items = items;
    }
}

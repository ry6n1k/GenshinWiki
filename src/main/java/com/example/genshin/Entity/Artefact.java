package com.example.genshin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "artefacts")
public class Artefact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    // @ManyToMany(mappedBy = "artefacts")
    // @JoinTable(name = "hero_artefact", joinColumns = @JoinColumn(name = "artefact_id"), inverseJoinColumns = @JoinColumn(name = "hero_id"))
    // private Set<Hero> heroes = new HashSet<>();

    // public void addHero(Hero hero) {
    //     heroes.add(hero);
    //     hero.setArtefact(this);
    // }

    // public void removeHero(Hero hero) {
    //     heroes.remove(hero);
    //     hero.setArtefact(null);
    // }

    public Artefact() {
    }

    public Artefact(String name) {
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

    // @JsonIgnore
    // public Set<Hero> getHeroes() {
    //     return heroes;
    // }

    // public void setHeroes(Set<Hero> heroes) {
    //     this.heroes = heroes;
    // }
}

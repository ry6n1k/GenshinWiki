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
@Table(name = "elements")
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "element", cascade = CascadeType.PERSIST, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("element")
    private List<Hero> heroes;

    public Element() {
    }

    public Element(String name) {
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

    public List<Hero> getHeroes(){
        return heroes;
    }

    public void setHeroes(List<Hero> heroes){
        this.heroes=heroes;
    }

}

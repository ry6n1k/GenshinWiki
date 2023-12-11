package com.example.genshin.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "heroes")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "talent_id", nullable = false)
    @JsonIgnoreProperties("heroes")
    private Talent talent;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id", nullable = false)
    @JsonIgnoreProperties("heroes")
    private WorldBossItem item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "element_id", nullable = false)
    @JsonIgnoreProperties("heroes")
    private Element element;

    // @ManyToMany()
    // @JoinTable(name = "hero_artefact", joinColumns = @JoinColumn(name =
    // "hero_id"), inverseJoinColumns = @JoinColumn(name = "artefact_id"))
    // private Set<Artefact> artefacts = new HashSet<>();

    // public void addComment(Artefact artefact) {
    // artefacts.add(artefact);
    // artefact.setHero(this);
    // }

    // public void removeComment(Artefact artefact) {
    // artefacts.remove(artefact);
    // artefact.setHero(null);
    // }

    public Hero() {
    }

    public Hero(String name) {
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

    public WorldBossItem getItem() {
        return item;
    }

    public void setItem(WorldBossItem item) {
        this.item = item;
    }

    public Talent getTalent() {
        return talent;
    }

    public void setTalent(Talent talent) {
        this.talent = talent;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    // public Set<Artefact> getArtefact() {
    // return artefacts;
    // }

    // public void setArtefact(Artefact artefact) {
    // this.artefacts = artefacts;
    // }

}

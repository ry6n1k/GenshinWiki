package com.example.genshin.Service;

import java.util.List;
import java.util.Optional;

import com.example.genshin.Entity.Element;

public interface ElementService {

    List<Element> findAll();

    Optional<Element> findById(Integer id);

    Element save(Element element);

    Element update(Element element);

    void delete(Integer id);
}

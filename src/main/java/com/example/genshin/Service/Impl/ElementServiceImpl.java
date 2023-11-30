package com.example.genshin.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.genshin.Entity.Element;
import com.example.genshin.Repository.ElementRepository;
import com.example.genshin.Repository.HeroRepository;
import com.example.genshin.Service.ElementService;

@Service
public class ElementServiceImpl implements ElementService {

    private final ElementRepository elementRepository;

    public ElementServiceImpl(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    @Override
    public List<Element> findAll() {
        return elementRepository.findAll();
    }

    @Override
    public Optional<Element> findById(Integer id) {
        return elementRepository.findById(id);
    }

    @Override
    public Element save(Element element) {
        return elementRepository.save(element);
    }

    @Override
    public Element update(Element element) {
        return elementRepository.save(element);
    }

    @Override
    public void delete(Integer id) {
        elementRepository.deleteById(id);
    }
}

package com.js.avangers.service;

import com.js.avangers.domain.Avanger;
import com.js.avangers.repository.AvangerRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Optional;

@Service
public class AvangerService implements Serializable {

    private final AvangerRepository avangerRepository;

    public AvangerService(AvangerRepository avangerRepository) {
        this.avangerRepository = avangerRepository;
    }

    public Avanger salvar(Avanger avanger) {
        return avangerRepository.save(avanger);
    }

    public Optional<Avanger> buscarPorId(String id) {
        return avangerRepository.findById(id);
    }

    public Iterable<Avanger> buscarTodos() {
        return avangerRepository.findAll();
    }

    public void deletar(Avanger avanger) {
        avangerRepository.delete(avanger);
    }
}

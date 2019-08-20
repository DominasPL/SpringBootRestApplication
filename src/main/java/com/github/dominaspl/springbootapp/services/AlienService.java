package com.github.dominaspl.springbootapp.services;

import com.github.dominaspl.springbootapp.converters.AlienConverter;
import com.github.dominaspl.springbootapp.dtos.AlienDTO;
import com.github.dominaspl.springbootapp.models.Alien;
import com.github.dominaspl.springbootapp.repositories.AlienRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlienService {

    private AlienRepository alienRepository;

    public AlienService(AlienRepository alienRepository) {
        this.alienRepository = alienRepository;
    }

    @Transactional
    public void addAlien(AlienDTO form) {

        if (form == null) {
            throw new IllegalStateException("Form can't be empty");
        }

        alienRepository.save(AlienConverter.convertToAlien(form));

    }

    public AlienDTO getAlienById(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Alien> optionalAlien = alienRepository.findById(id);
        Alien alien = optionalAlien.orElse(new Alien());


        return AlienConverter.convertToAlienDTO(alien);
    }
}

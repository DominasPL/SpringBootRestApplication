package com.github.dominaspl.springbootapp.services;

import com.github.dominaspl.springbootapp.converters.AlienConverter;
import com.github.dominaspl.springbootapp.dtos.AddAlienDTO;
import com.github.dominaspl.springbootapp.repositories.AlienRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlienService {

    private AlienRepository alienRepository;

    public AlienService(AlienRepository alienRepository) {
        this.alienRepository = alienRepository;
    }

    @Transactional
    public void addAlien(AddAlienDTO form) {

        if (form == null) {
            throw new IllegalStateException("Form can't be empty");
        }

        alienRepository.save(AlienConverter.convertToAlien(form));

    }
}

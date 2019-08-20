package com.github.dominaspl.springbootapp.services;

import com.github.dominaspl.springbootapp.converters.AlienConverter;
import com.github.dominaspl.springbootapp.dtos.AlienDTO;
import com.github.dominaspl.springbootapp.models.Alien;
import com.github.dominaspl.springbootapp.repositories.AlienRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
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

    public List<AlienDTO> findAllAliens() {

        List<Alien> aliens = alienRepository.findAll();

        if (aliens == null) {
            log.info("Aliens not found");
            return null;
        }

        return AlienConverter.convertToAlienDTOList(alienRepository.findAll());

    }

}
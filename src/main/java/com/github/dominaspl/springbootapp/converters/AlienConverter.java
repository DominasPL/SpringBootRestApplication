package com.github.dominaspl.springbootapp.converters;

import com.github.dominaspl.springbootapp.dtos.AlienDTO;
import com.github.dominaspl.springbootapp.models.Alien;

import java.util.ArrayList;
import java.util.List;

public class AlienConverter {


    public static Alien convertToAlien(AlienDTO form) {

        Alien alien = new Alien();
        alien.setName(form.getName());
        alien.setTech(form.getTech());
        return alien;
    }

    public static AlienDTO convertToAlienDTO(Alien alien) {

        AlienDTO alienDTO = new AlienDTO();
        alienDTO.setId(alien.getId());
        alienDTO.setName(alien.getName());
        alienDTO.setTech(alien.getTech());
        return alienDTO;
    }

    public static List<AlienDTO> convertToAlienDTOList(List<Alien> allAliens) {

        List<AlienDTO> alienDTOS = new ArrayList<>();

        for (Alien alien : allAliens) {
            AlienDTO alienDTO = new AlienDTO();
            alienDTO.setId(alien.getId());
            alienDTO.setName(alien.getName());
            alienDTO.setTech(alien.getTech());
            alienDTOS.add(alienDTO);
        }

        return alienDTOS;
    }
}

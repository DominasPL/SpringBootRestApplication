package com.github.dominaspl.springbootapp.converters;

import com.github.dominaspl.springbootapp.dtos.AlienDTO;
import com.github.dominaspl.springbootapp.models.Alien;

public class AlienConverter {


    public static Alien convertToAlien(AlienDTO form) {

        Alien alien = new Alien();
        alien.setName(form.getName());
        alien.setTech(form.getTech());
        return alien;
    }

    public static AlienDTO convertToAlienDTO(Alien alien) {

        AlienDTO alienDTO = new AlienDTO();
        alienDTO.setName(alien.getName());
        alienDTO.setTech(alien.getTech());
        return alienDTO;
    }
}

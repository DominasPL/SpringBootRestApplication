package com.github.dominaspl.springbootapp.converters;

import com.github.dominaspl.springbootapp.dtos.AddAlienDTO;
import com.github.dominaspl.springbootapp.models.Alien;

public class AlienConverter {


    public static Alien convertToAlien(AddAlienDTO form) {

        Alien alien = new Alien();
        alien.setName(form.getName());
        return alien;
    }
}

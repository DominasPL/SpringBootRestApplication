package com.github.dominaspl.springbootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class AlienController {

    @GetMapping
    public String home() {

        return "home";
    }

}

package com.github.dominaspl.springbootapp.controllers;

import com.github.dominaspl.springbootapp.dtos.AddAlienDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AlienController {

    @GetMapping
    public String home(Model model) {

        model.addAttribute("alien", new AddAlienDTO());

        return "home";
    }

}

package com.github.dominaspl.springbootapp.controllers;

import com.github.dominaspl.springbootapp.dtos.AddAlienDTO;
import com.github.dominaspl.springbootapp.services.AlienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/addAlien")
public class AlienController {

    private AlienService alienService;

    public AlienController(AlienService alienService) {
        this.alienService = alienService;
    }

    @GetMapping
    public String displayAlienForm(Model model) {

        model.addAttribute("form", new AddAlienDTO());

        return "add-alien";
    }

    @PostMapping
    public String addAlien(@Valid @ModelAttribute("form") AddAlienDTO form, BindingResult result) {

        if (result.hasErrors()) {
            return "add-alien";
        }

        alienService.addAlien(form);

        return "redirect:/";
    }

}

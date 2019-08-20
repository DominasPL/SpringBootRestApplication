package com.github.dominaspl.springbootapp.controllers;

import com.github.dominaspl.springbootapp.dtos.AlienDTO;
import com.github.dominaspl.springbootapp.services.AlienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/alien")
public class AlienController {

    private AlienService alienService;

    public AlienController(AlienService alienService) {
        this.alienService = alienService;
    }

    @GetMapping("/addAlien")
    public String displayAddAlienForm(Model model) {

        model.addAttribute("form", new AlienDTO());

        return "add-alien";
    }

    @PostMapping("/addAlien")
    public String addAlien(@Valid @ModelAttribute("form") AlienDTO form, BindingResult result) {

        if (result.hasErrors()) {
            return "add-alien";
        }

        alienService.addAlien(form);

        return "redirect:/alien/addAlien";
    }

    @GetMapping("/alienIdForm")
    public String displayGetAlienForm() {

        return "alien-id-form";
    }

    @GetMapping("/alienIdForm/getAlien")
    public String getAlien(Model model, @RequestParam("id") Long id) {

        AlienDTO alienDTO = alienService.getAlienById(id);

        model.addAttribute("alien", alienDTO);

        return "show-alien";
    }


}

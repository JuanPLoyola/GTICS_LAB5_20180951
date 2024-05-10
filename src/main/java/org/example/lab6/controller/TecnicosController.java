package org.example.lab6.controller;


import org.example.lab6.entity.Tecnicos;
import org.example.lab6.repository.TecnicoRepository;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TecnicosController {

    final TecnicoRepository tecnicoRepository;

    public TecnicosController(TecnicoRepository tecnicoRepository) {
        this.tecnicoRepository = tecnicoRepository;
    }

    @PostMapping(value = {"/Tecnicos"})
    public String tecnicos(Model model){
        List<Tecnicos> lista = tecnicoRepository.findAll();
        model.addAttribute("Lista",lista);


        return "/GTICSF";
    }



}

package br.com.fatec.api.project.controller;

import br.com.fatec.api.project.model.Estacao;
import br.com.fatec.api.project.repository.EstacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController

public class HomeController {

    @Autowired
    private EstacaoRepository repository;

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    //endpoints
    @GetMapping(value = "/estacao")
    public List<Estacao> listarEstacao(){
        List<Estacao> lista = repository.findAll();
        return lista;

    }
}

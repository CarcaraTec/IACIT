package br.com.api.testeProjeto.controller;

import br.com.api.testeProjeto.model.Regiao;
import br.com.api.testeProjeto.repository.IRegiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin("*")


public class RegiaoController {

    @Autowired
    private IRegiao repository;

    @RequestMapping(value = "/regiao")
    public ModelAndView regioes(){
        ModelAndView andView = new ModelAndView("regiao/regiaoinicio");
        Iterable<Regiao> regioesIterable = repository.findAll();
        andView.addObject("regioes", regioesIterable);
        return andView;

    }
}

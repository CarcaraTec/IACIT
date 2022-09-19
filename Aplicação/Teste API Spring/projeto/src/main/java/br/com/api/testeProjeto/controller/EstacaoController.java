package br.com.api.testeProjeto.controller;

import br.com.api.testeProjeto.model.Estacao;
import br.com.api.testeProjeto.repository.IEstacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin("*")

public class EstacaoController {

    @Autowired
    private IEstacao repository;

    @RequestMapping(value = "/estacao")
    public ModelAndView estacoes() {
        ModelAndView andView = new ModelAndView("estacao/estacaoinicio");
        Iterable<Estacao> estacoesIterable = repository.findAll();
        andView.addObject("estacoes", estacoesIterable);
        return andView;
    }

    @GetMapping(value = "/estacao/{nome}")
    public ModelAndView listarEstacaoPorNome(@PathVariable("nome") String nome) {
        ModelAndView andView = new ModelAndView("estacao/estacaoinicio");
        Iterable<Estacao> estacoesIterable = repository.findByNome(nome);
        andView.addObject("estacoes", estacoesIterable);
        return andView;
    }
    //Listar estação por nome
    /*@GetMapping("/{nome}")
    public ResponseEntity<List<Estacao>> listaEstacaoPorNome(@PathVariable String nome){
        return ResponseEntity.status(200).body(estacaoService.listarEstacaoPorNome(nome));
    }*/
}


package br.com.api.testeProjeto.controller;

import br.com.api.testeProjeto.model.Estacao;
import br.com.api.testeProjeto.service.EstacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/estacao")

public class EstacaoController {

    private EstacaoService estacaoService;
    public EstacaoController(EstacaoService estacaoService){
        this.estacaoService = estacaoService;
    }

    @GetMapping
    public ResponseEntity<List<Estacao>> listaEstacao(){
        return ResponseEntity.status(200).body(estacaoService.listarEstacao());

    }
}

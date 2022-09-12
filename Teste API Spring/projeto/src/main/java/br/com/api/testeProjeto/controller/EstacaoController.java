package br.com.api.testeProjeto.controller;

import br.com.api.testeProjeto.model.Estacao;
import br.com.api.testeProjeto.repository.IEstacao;
import br.com.api.testeProjeto.service.EstacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //Listar estação por nome
    @GetMapping("/{nome}")
    public ResponseEntity<List<Estacao>> listaEstacaoPorNome(@PathVariable String nome){
        return ResponseEntity.status(200).body(estacaoService.listarEstacaoPorNome(nome));
    }
}


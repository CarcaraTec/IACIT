package br.com.api.testeProjeto.controller;

import br.com.api.testeProjeto.model.Regiao;
import br.com.api.testeProjeto.service.RegiaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/regiao")

public class RegiaoController {

    private RegiaoService regiaoService;
    public RegiaoController(RegiaoService regiaoService){
        this.regiaoService = regiaoService;
    }

    @GetMapping
    public ResponseEntity<List<Regiao>> listaRegiao(){
        return ResponseEntity.status(200).body(regiaoService.listarRegiao());

    }
}

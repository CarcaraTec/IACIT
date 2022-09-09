package br.com.api.testeProjeto.controller;

import br.com.api.testeProjeto.model.Descritivo;
import br.com.api.testeProjeto.service.DescritivoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/descritivo")
public class DescritivoController {

    private DescritivoService descritivoService;
    public DescritivoController(DescritivoService descritivoService){
        this.descritivoService = descritivoService;
    }

    @GetMapping
    public ResponseEntity<List<Descritivo>> listaDescritivo(){
        return ResponseEntity.status(200).body(descritivoService.listarDescritivo());

    }
}

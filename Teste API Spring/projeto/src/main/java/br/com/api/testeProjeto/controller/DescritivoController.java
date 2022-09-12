package br.com.api.testeProjeto.controller;

import br.com.api.testeProjeto.model.Descritivo;
import br.com.api.testeProjeto.service.DescritivoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id_descritivo}")
    public ResponseEntity<Optional<Descritivo>> listaDescritivoPorId(@PathVariable Integer id_descritivo){
        return ResponseEntity.status(200).body(descritivoService.listarDescritivoPorId(id_descritivo));
    }

    //postar um descritivo
    @PostMapping
    public ResponseEntity<Descritivo> criarDescritivo(@RequestBody Descritivo descritivo){
        return ResponseEntity.status(201).body(descritivoService.criarDescritivo(descritivo));
    }
}

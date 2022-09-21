package br.com.api.testeProjeto.controller;

import br.com.api.testeProjeto.model.Descritivo;
import br.com.api.testeProjeto.repository.IDescritivo;
import br.com.api.testeProjeto.service.DescritivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@CrossOrigin("*")
public class DescritivoController {

    private DescritivoService descritivoService;
    public DescritivoController(DescritivoService descritivoService){
        this.descritivoService = descritivoService;
    }
    @Autowired
    private IDescritivo repository;

    @RequestMapping(value = "/descritivo")
    public ModelAndView descritivos() {
        ModelAndView andView = new ModelAndView("descritivo/descritivoinicio");
        Iterable<Descritivo> descritivosIterable = repository.findAll();
        andView.addObject("descritivos", descritivosIterable);
        return andView;
    }

    /*@GetMapping(value = "/descritivo/{id_descritivo}")
    public ModelAndView listaDescritivoPorId(@PathVariable("id_descritivo") Integer id_descritivo){
        ModelAndView andView = new ModelAndView("descritivo/descritivoinicio");
        Iterable<Descritivo> descritivosIterable = repository.findById(Integer id_descritivo);
        andView.addObject("descritivos", descritivosIterable);
        return andView;
    }*/


    @RequestMapping("/descritivo/{id_descritivo}")
    public ResponseEntity<Optional<Descritivo>> listaDescritivoPorId(@PathVariable Integer id_descritivo){
        return ResponseEntity.status(200).body(descritivoService.listarDescritivoPorId(id_descritivo));
    }

    //postar um descritivo
    /*@PostMapping
    public ResponseEntity<Descritivo> criarDescritivo(@RequestBody Descritivo descritivo){
        return ResponseEntity.status(201).body(descritivoService.criarDescritivo(descritivo));
    }*/
}

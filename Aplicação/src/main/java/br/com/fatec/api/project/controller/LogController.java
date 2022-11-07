package br.com.fatec.api.project.controller;

import br.com.fatec.api.project.model.Log;
import br.com.fatec.api.project.model.Usuario;
import br.com.fatec.api.project.service.LogService;
import br.com.fatec.api.project.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/log")
public class LogController {

//    @RequestMapping("/index.html")
//    public ModelAndView usuario(){
//        ModelAndView andView = new ModelAndView("index.html");
//        return andView;
//    }

    private LogService logService;
    public LogController(LogService logService){
        this.logService = logService;

    }

    @GetMapping
    public ResponseEntity<List<Log>> listaLogs(){
    return ResponseEntity.status(200).body(logService.listarLogs());

    }

    @PostMapping
    public ResponseEntity<Log> criarLog(@RequestBody Log log){
        return ResponseEntity.status(201).body(logService.criarLog(log));
    }

}

package br.com.fatec.api.project.controller;

import br.com.fatec.api.project.model.Usuario;
import br.com.fatec.api.project.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

//    @RequestMapping("/index.html")
//    public ModelAndView usuario(){
//        ModelAndView andView = new ModelAndView("index.html");
//        return andView;
//    }

    private UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;

    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listaUsuarios(){
    return ResponseEntity.status(200).body(usuarioService.listarUsuario());

    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(201).body(usuarioService.criarUsuario(usuario));
    }

    @PutMapping()
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(200).body(usuarioService.editarUsuario(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirUsuario(@PathVariable Integer id){
        usuarioService.excluirUsuario(id);
        return ResponseEntity.status(204).build();
    }
}

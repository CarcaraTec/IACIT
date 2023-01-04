package br.com.fatec.api.project.controller;

import br.com.fatec.api.project.model.Log;
import br.com.fatec.api.project.model.UsuarioConfig;
import br.com.fatec.api.project.service.LogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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


    @PostMapping("/postUni")
    public String criarLog2(@RequestBody UsuarioConfig usuarioConfig) throws IOException {

        Path path = Paths.get("C:\\Users\\Igor\\Desktop\\Aplicacao\\Aplicação\\Uni.txt");
        List<String> linhas = Files.readAllLines(path);

        String novoConteudo = usuarioConfig.getEmail() + "," + usuarioConfig.getNome() + "," + usuarioConfig.getSobrenome() + "," + usuarioConfig.getTelefone() + "," + usuarioConfig.getCpf() + "," + usuarioConfig.getDataNasc() + "," + usuarioConfig.getCargo() + "," + usuarioConfig.getImg();
        //linhas.get(0).substring(0, 7) + "conteudo" + linhas.get(0).substring(15);

        // linhas.remove(0);
        linhas.add(1, novoConteudo);

        Files.write(path, linhas);

        return "";
    }

    @GetMapping(value = "/getUsuario/{email}")
    public UsuarioConfig getUrl(@PathVariable("email") String cartao) {
        UsuarioConfig userConfig = new UsuarioConfig();
        String conteudo = null;

        String path = "C:\\Users\\Igor\\Desktop\\Aplicacao\\Aplicação\\Uni.txt";

        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            line = br.readLine();
            while (line != null) {

                String[] vect = line.split(",");

                list.add(vect[0]);
                list.add(vect[1]);
                list.add(vect[2]);
                list.add(vect[3]);
                list.add(vect[4]);
                list.add(vect[5]);
                list.add(vect[6]);

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try{
            userConfig.setEmail(list.get(list.indexOf(cartao)));
            userConfig.setNome(list.get(list.indexOf(cartao) + 1));
            userConfig.setSobrenome(list.get(list.indexOf(cartao) + 2));
            userConfig.setTelefone(list.get(list.indexOf(cartao) + 3));
            userConfig.setCpf(list.get(list.indexOf(cartao) + 4));
            userConfig.setDataNasc(list.get(list.indexOf(cartao) + 5));
            userConfig.setCargo(list.get(list.indexOf(cartao) + 6));
        }catch (Exception e){
            userConfig.setEmail("Undefined");
            userConfig.setNome("");
            userConfig.setSobrenome("");
            userConfig.setTelefone("");
            userConfig.setCpf("");
            userConfig.setDataNasc("");
            userConfig.setCargo("");
        }



        return userConfig;
    }

}

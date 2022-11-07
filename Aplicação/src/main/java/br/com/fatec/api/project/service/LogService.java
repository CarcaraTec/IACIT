package br.com.fatec.api.project.service;


import br.com.fatec.api.project.model.Log;
import br.com.fatec.api.project.model.Usuario;
import br.com.fatec.api.project.repository.ILog;
import br.com.fatec.api.project.repository.IUsuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private ILog repository;

    public LogService(ILog repository){
        this.repository = repository;
    }

    public List<Log> listarLogs(){
        List<Log> lista = repository.findAll();
        return lista;
    }

    public Log criarLog(Log log){
        Log novoLog = repository.save(log);
        return novoLog;
    }
}

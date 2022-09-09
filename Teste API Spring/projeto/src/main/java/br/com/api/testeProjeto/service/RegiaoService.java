package br.com.api.testeProjeto.service;


import br.com.api.testeProjeto.model.Regiao;
import br.com.api.testeProjeto.repository.IRegiao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegiaoService {

    private IRegiao repository;
    public RegiaoService(IRegiao repository){
        this.repository = repository;
    }

    public List<Regiao> listarRegiao(){
        List<Regiao> lista = repository.findAll();
        return lista;
    }
}

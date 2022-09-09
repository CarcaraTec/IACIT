package br.com.api.testeProjeto.service;

import br.com.api.testeProjeto.model.Descritivo;
import br.com.api.testeProjeto.repository.IDescritivo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescritivoService {

    private IDescritivo repository;
    public DescritivoService(IDescritivo repository){
        this.repository = repository;
    }

    public List<Descritivo> listarDescritivo(){
        List<Descritivo> lista = repository.findAll();
        return lista;
    }
}

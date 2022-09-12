package br.com.api.testeProjeto.service;

import br.com.api.testeProjeto.model.Estacao;
import br.com.api.testeProjeto.repository.IEstacao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EstacaoService {

    private IEstacao repository;
    public EstacaoService(IEstacao repository){
        this.repository = repository;
    }

    public List<Estacao> listarEstacao(){
        List<Estacao> lista = repository.findAll();
        return lista;
    }

    public List<Estacao> listarEstacaoPorNome(@PathVariable("nome") String nome){
        List<Estacao> lista = repository.findByNome(nome);
        return lista;
    }

}

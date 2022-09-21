package br.com.api.testeProjeto.service;

import br.com.api.testeProjeto.model.Descritivo;
import br.com.api.testeProjeto.repository.IDescritivo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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

    public Optional<Descritivo> listarDescritivoPorId(@PathVariable("id") Integer id_descritivo){
        Optional<Descritivo> lista = repository.findById(id_descritivo);
        return lista;
    }

    //Método/service de criar descritivo
    public Descritivo criarDescritivo(Descritivo descritivo){
        Descritivo descritivoNovo = repository.save(descritivo);
        return descritivoNovo;
    }
}

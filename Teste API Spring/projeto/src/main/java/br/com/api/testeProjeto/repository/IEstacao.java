package br.com.api.testeProjeto.repository;

import br.com.api.testeProjeto.model.Estacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEstacao extends JpaRepository<Estacao, Integer> {
    List<Estacao> findByNome(String nome);
}

package br.com.api.testeProjeto.repository;

import br.com.api.testeProjeto.model.Estacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IEstacao extends JpaRepository<Estacao, Integer> {
    List<Estacao> findByNome(String nome);
}

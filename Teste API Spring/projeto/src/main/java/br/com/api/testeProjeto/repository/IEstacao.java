package br.com.api.testeProjeto.repository;

import br.com.api.testeProjeto.model.Estacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstacao extends JpaRepository<Estacao, Integer> {
}

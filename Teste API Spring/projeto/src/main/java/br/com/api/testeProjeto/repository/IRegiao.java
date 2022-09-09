package br.com.api.testeProjeto.repository;

import br.com.api.testeProjeto.model.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegiao extends JpaRepository<Regiao, Integer> {
}

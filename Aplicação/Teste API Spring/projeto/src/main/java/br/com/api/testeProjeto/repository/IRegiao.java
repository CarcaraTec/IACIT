package br.com.api.testeProjeto.repository;

import br.com.api.testeProjeto.model.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IRegiao extends JpaRepository<Regiao, Integer> {
}

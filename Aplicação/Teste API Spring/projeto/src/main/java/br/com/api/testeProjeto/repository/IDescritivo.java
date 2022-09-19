package br.com.api.testeProjeto.repository;

import br.com.api.testeProjeto.model.Descritivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IDescritivo extends JpaRepository<Descritivo, Integer>{
}

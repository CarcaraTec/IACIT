package br.com.api.testeProjeto.repository;

import br.com.api.testeProjeto.model.Descritivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDescritivo extends JpaRepository<Descritivo, Integer>{
}

package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Log;
import br.com.fatec.api.project.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILog extends JpaRepository<Log, Integer> {

}

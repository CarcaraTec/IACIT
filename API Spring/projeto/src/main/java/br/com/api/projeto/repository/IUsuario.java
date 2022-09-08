package br.com.api.projeto.repository;

import br.com.api.projeto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

}

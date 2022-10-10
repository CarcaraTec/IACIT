package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Vento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface VentoRepository extends JpaRepository<Vento, String> {
}

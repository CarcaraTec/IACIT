package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@EnableJpaRepositories
@Transactional
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
    //List<Estado> findByRegiao(String regiao);

    @Query(nativeQuery = true, value = "select * from estado where fk_regiao_nome_regiao = (:regiao)")
    List<Estado> findByRegiao(String regiao);

}

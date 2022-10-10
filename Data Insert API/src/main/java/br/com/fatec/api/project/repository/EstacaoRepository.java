package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Estacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface EstacaoRepository extends JpaRepository<Estacao, String> {

    //List<Estacao> findByNome(String nome_estacao);

    //@Query(nativeQuery = true, value = "select * from estacao, estado where nome_estacao = 'Belo Horizonte' and fk_estado_estado_id = estado_id")
    //List<Estacao> findBySJC();
}

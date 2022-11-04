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

    //List<Estacao> findByNomeEstacao(String nomeEstacao);

    //@Query(nativeQuery = true, value = "select * from estacao where nome_estacao = (:nomeEstacao)")
   // List<Estacao> findByNome(String nomeEstacao);

    @Query(nativeQuery = true, value = "select * from estado, estacao where fk_regiao_nome_regiao = (:regiao) and fk_estado_nome_estado = (:estado) and fk_estado_nome_estado = nome_estado")
    List<Estacao> findByEstado(String regiao, String estado);

}

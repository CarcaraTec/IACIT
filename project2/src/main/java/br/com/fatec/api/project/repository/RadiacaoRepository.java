package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Radiacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface RadiacaoRepository extends JpaRepository<Radiacao, String> {
    List<Radiacao> findByEstacao(String estacao);

    //LISTAR RADIAÇÃO FILTRO DATA
    @Query(nativeQuery = true, value = "select rad_id, rad_data, rad_hora, rad_global, fk_estacao_cod_wmo from radiacao_global, estacao where rad_data = (:radData) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Radiacao> findByRadData(Date radData, String codigo);

    //FILTRO DATA/HORA
    @Query(nativeQuery = true, value = "select rad_id, rad_data, rad_hora, rad_global, fk_estacao_cod_wmo from radiacao_global, estacao where rad_data = (:radData) and rad_hora = (:radHora) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Radiacao> findByRadHora(Date radData, Date radHora, String codigo);
}

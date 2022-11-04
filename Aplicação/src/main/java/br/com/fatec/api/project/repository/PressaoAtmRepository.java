package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.PressaoAtm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface PressaoAtmRepository extends JpaRepository<PressaoAtm, String> {
    //LISTAR PRESSAO POR ESTACAO
    List<PressaoAtm> findByEstacao(String estacao);

    //LISTAR PRESSAO FILTRO DATA
    @Query(nativeQuery = true, value = "select pre_atm_id, pre_data, pre_hora, pre_atm_estacao, pre_atm_max, pre_atm_min, fk_estacao_cod_wmo from pressao_atmosferica, estacao where pre_data = (:pressaoData) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<PressaoAtm> findByPressaoData(Date pressaoData, String codigo);

    //FILTRO DATA/HORA
    @Query(nativeQuery = true, value = "select pre_atm_id, pre_data, pre_hora, pre_atm_estacao, pre_atm_max, pre_atm_min, fk_estacao_cod_wmo from pressao_atmosferica, estacao where pre_data = (:pressaoData) and pre_hora = (:pressaoHora) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<PressaoAtm> findByPressaoHora(Date pressaoData, Date pressaoHora, String codigo);
}

package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Vento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface VentoRepository extends JpaRepository<Vento, String> {

    List<Vento> findByEstacao(String estacao);

    //LISTAR VENTO FILTRO DATA
    @Query(nativeQuery = true, value = "select ven_id, ven_data, ven_hora, ven_direcao_hor, ven_rajada_max, ven_velocidade_hor, fk_estacao_cod_wmo " +
            "from vento, estacao where ven_data = (:ventoData) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Vento> findByVentoData(Date ventoData, String codigo);

    //FILTRO DATA/HORA
    @Query(nativeQuery = true, value = "select ven_id, ven_data, ven_hora, ven_direcao_hor, ven_rajada_max, ven_velocidade_hor, fk_estacao_cod_wmo " +
            "from vento, estacao where ven_data = (:ventoData) and ven_hora = (:ventoHora) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Vento> findByVentoHora(Date ventoData, Date ventoHora, String codigo);
}

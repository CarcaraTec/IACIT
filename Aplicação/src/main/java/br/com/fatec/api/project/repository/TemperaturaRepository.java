package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface TemperaturaRepository extends JpaRepository<Temperatura, String> {

    List<Temperatura> findByEstacao(String estacao);

    //LISTAR TEMPERATURA FILTRO DATA
    @Query(nativeQuery = true, value = "select temp_id, temp_data, temp_hora, temp_ar, temp_ponto_orvalho, " +
            "temp_max, temp_min, temp_orvalho_max, temp_orvalho_min, fk_estacao_cod_wmo " +
            "from temperatura, estacao where temp_data = (:tempData) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Temperatura> findByTempData(Date tempData, String codigo);

    //FILTRO DATA/HORA
    @Query(nativeQuery = true, value = "select temp_id, temp_data, temp_hora, temp_ar, temp_ponto_orvalho, " +
            "temp_max, temp_min, temp_orvalho_max, temp_orvalho_min, fk_estacao_cod_wmo " +
            "from temperatura, estacao where temp_data = (:tempData) and temp_hora = (:tempHora) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Temperatura> findByTempHora(Date tempData, Date tempHora, String codigo);
}


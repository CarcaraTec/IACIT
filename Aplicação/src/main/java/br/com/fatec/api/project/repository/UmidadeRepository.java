package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Umidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface UmidadeRepository extends JpaRepository<Umidade, String> {

    List<Umidade> findByEstacao(String estacao);

    //LISTAR PRESSAO FILTRO DATA
    @Query(nativeQuery = true, value = "select umi_id, umi_data, umi_hora, umi_rel_max, umi_rel_min, umi_rel_ar, fk_estacao_cod_wmo " +
            "from umidade, estacao where umi_data = (:umiData) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Umidade> findByUmiData(Date umiData, String codigo);

    //FILTRO DATA/HORA
    @Query(nativeQuery = true, value = "select umi_id, umi_data, umi_hora, umi_rel_max, umi_rel_min, umi_rel_ar, fk_estacao_cod_wmo " +
            "from umidade, estacao where umi_data = (:umiData) and umi_hora = (:umiHora) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Umidade> findByUmiHora(Date umiData, Date umiHora, String codigo);
}

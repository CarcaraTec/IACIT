package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Precipitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface PrecipitacaoRepository extends JpaRepository<Precipitacao, String> {
    //@Query(nativeQuery = true, value = "select prec_id, prec_data, prec_hora, prec_total, fk_estacao_cod_wmo, cod_wmo, nome_estado, fk_regiao_nome_regiao from precipitacao, estacao, estado where fk_estacao_cod_wmo = (:estacao) and fk_estacao_cod_wmo = cod_wmo and fk_estado_nome_estado = (:estado) and fk_estado_nome_estado = nome_estado and fk_regiao_nome_regiao = (:regiao);")
    //List<Precipitacao> findByEstacao(String regiao, String estado, String estacao);

    //LISTAR PRECIPITAÇÃO POR ESTAÇÃO
    List<Precipitacao> findByEstacao(String estacao);

    //LISTAR PRECIPITAÇÃO FILTRO DATA
    @Query(nativeQuery = true, value = "select prec_id, prec_data, prec_hora, prec_total, fk_estacao_cod_wmo from precipitacao, estacao where prec_data = (:precData) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Precipitacao> findByPrecData(Date precData, String codigo);

    //FILTRO DATA/HORA
    @Query(nativeQuery = true, value = "select prec_id, prec_data, prec_hora, prec_total, fk_estacao_cod_wmo from precipitacao, estacao where prec_data = (:precData) and prec_hora = (:precHora) and fk_estacao_cod_wmo = (:codigo) and fk_estacao_cod_wmo = cod_wmo")
    List<Precipitacao> findByPrecHora(Date precData, Date precHora, String codigo);
}

package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "temperatura")

public class Temperatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "temp_id")
    private Integer tempId;

    @Column(name = "temp_ar")
    private BigDecimal tempAr;

    @Column(name = "temp_ponto_orvalho")
    private BigDecimal tempPontoOrvalho;

    @Column(name = "temp_max")
    private BigDecimal tempMax;

    @Column(name = "temp_min")
    private BigDecimal tempMin;

    @Column(name = "temp_orvalho_max")
    private BigDecimal tempOrvalhoMax;

    @Column(name = "temp_orvalho_min")
    private BigDecimal tempOrvalhoMin;

    @Column(name = "temp_data")
    private Date tempData;

    @Column(name = "temp_hora")
    private Date tempHora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Temperatura() {
    }

    public Temperatura(Integer tempId, Date tempData, Date tempHora, BigDecimal tempAr, BigDecimal tempPontoOrvalho,
                       BigDecimal tempMax, BigDecimal tempMin, BigDecimal tempOrvalhoMax,
                       BigDecimal tempOrvalhoMin, String estacao) {
        this.tempId = tempId;
        this.tempAr = tempAr;
        this.tempPontoOrvalho = tempPontoOrvalho;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.tempOrvalhoMax = tempOrvalhoMax;
        this.tempOrvalhoMin = tempOrvalhoMin;
        this.tempData = tempData;
        this.tempHora = tempHora;
        this.estacao = estacao;
    }

    public Integer getTemp_id() {
        return tempId;
    }

    public void setTemp_id(Integer temp_id) {
        this.tempId = temp_id;
    }

    public BigDecimal getTemp_ar() {
        return tempAr;
    }

    public void setTemp_ar(BigDecimal temp_ar) {
        this.tempAr = temp_ar;
    }

    public BigDecimal getTemp_ponto_orvalho() {
        return tempPontoOrvalho;
    }

    public void setTemp_ponto_orvalho(BigDecimal temp_ponto_orvalho) {
        this.tempPontoOrvalho = temp_ponto_orvalho;
    }

    public BigDecimal getTemp_max() {
        return tempMax;
    }

    public void setTemp_max(BigDecimal temp_max) {
        this.tempMax = temp_max;
    }

    public BigDecimal getTemp_min() {
        return tempMin;
    }

    public void setTemp_min(BigDecimal temp_min) {
        this.tempMin = temp_min;
    }

    public BigDecimal getTemp_orvalho_max() {
        return tempOrvalhoMax;
    }

    public void setTemp_orvalho_max(BigDecimal temp_orvalho_max) {
        this.tempOrvalhoMax = temp_orvalho_max;
    }

    public BigDecimal getTemp_orvalho_min() {
        return tempOrvalhoMin;
    }

    public void setTemp_orvalho_min(BigDecimal temp_orvalho_min) {
        this.tempOrvalhoMin = temp_orvalho_min;
    }

    public Date getTemp_data() {
        return tempData;
    }

    public void setTemp_data(Date temp_data) {
        this.tempData = temp_data;
    }

    public Date getTemp_hora() {
        return tempHora;
    }

    public void setTemp_hora(Date temp_hora) {
        this.tempHora = temp_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

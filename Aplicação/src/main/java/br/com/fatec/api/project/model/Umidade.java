package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "umidade")

public class Umidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umi_id")
    private Integer umiId;

    @Column(name = "umi_data")
    private Date umiData;

    @Column(name = "umi_hora")
    private Date umiHora;

    @Column(name = "umi_rel_max")
    private BigDecimal umiMax;

    @Column(name = "umi_rel_min")
    private BigDecimal umiMin;

    @Column(name = "umi_rel_ar")
    private BigDecimal umiAr;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Umidade(Integer umiId, Date umiData, Date umiHora, BigDecimal umiMax, BigDecimal umiMin, BigDecimal umiAr, String estacao) {
        this.umiId = umiId;
        this.umiData = umiData;
        this.umiHora = umiHora;
        this.umiMax = umiMax;
        this.umiMin = umiMin;
        this.umiAr = umiAr;
        this.estacao = estacao;
    }

    public Integer getUmi_id() {
        return umiId;
    }

    public void setUmi_id(Integer umi_id) {
        this.umiId = umi_id;
    }

    public BigDecimal getUmi_max() {
        return umiMax;
    }

    public void setUmi_max(BigDecimal umi_max) {
        this.umiMax = umi_max;
    }

    public BigDecimal getUmi_min() {
        return umiMin;
    }

    public void setUmi_min(BigDecimal umi_min) {
        this.umiMin = umi_min;
    }

    public BigDecimal getUmi_ar() {
        return umiAr;
    }

    public void setUmi_ar(BigDecimal umi_ar) {
        this.umiAr = umi_ar;
    }

    public Date getUmi_data() {
        return umiData;
    }

    public void setUmi_data(Date umi_data) {
        this.umiData = umi_data;
    }

    public Date getUmi_hora() {
        return umiHora;
    }

    public void setUmi_hora(Date umi_hora) {
        this.umiHora = umi_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return "Umidade{" +
                "umiId=" + umiId +
                ", umiMax=" + umiMax +
                ", umiMin=" + umiMin +
                ", umiAr=" + umiAr +
                ", umiData=" + umiData +
                ", umiHora=" + umiHora +
                ", estacao='" + estacao + '\'' +
                '}';
    }
}

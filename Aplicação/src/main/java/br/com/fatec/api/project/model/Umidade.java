package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "umidade")

public class Umidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umi_id")
    private Integer umiId;

    @Column(name = "umi_rel_max")
    private double umiMax;

    @Column(name = "umi_rel_min")
    private double umiMin;

    @Column(name = "umi_rel_ar")
    private double umiAr;

    @Column(name = "umi_data")
    private Date umiData;

    @Column(name = "umi_hora")
    private Date umiHora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getUmi_id() {
        return umiId;
    }

    public void setUmi_id(Integer umi_id) {
        this.umiId = umi_id;
    }

    public double getUmi_max() {
        return umiMax;
    }

    public void setUmi_max(double umi_max) {
        this.umiMax = umi_max;
    }

    public double getUmi_min() {
        return umiMin;
    }

    public void setUmi_min(double umi_min) {
        this.umiMin = umi_min;
    }

    public double getUmi_ar() {
        return umiAr;
    }

    public void setUmi_ar(double umi_ar) {
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

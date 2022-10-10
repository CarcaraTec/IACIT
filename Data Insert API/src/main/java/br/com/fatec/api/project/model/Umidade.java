package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "umidade")

public class Umidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umi_id")
    private Integer umi_id;

    @Column(name = "umi_rel_max")
    private double umi_max;

    @Column(name = "umi_rel_min")
    private double umi_min;

    @Column(name = "umi_rel_ar")
    private double umi_ar;

    @Column(name = "umi_data")
    private String umi_data;

    @Column(name = "umi_hora")
    private String umi_hora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getUmi_id() {
        return umi_id;
    }

    public void setUmi_id(Integer umi_id) {
        this.umi_id = umi_id;
    }

    public double getUmi_max() {
        return umi_max;
    }

    public void setUmi_max(double umi_max) {
        this.umi_max = umi_max;
    }

    public double getUmi_min() {
        return umi_min;
    }

    public void setUmi_min(double umi_min) {
        this.umi_min = umi_min;
    }

    public double getUmi_ar() {
        return umi_ar;
    }

    public void setUmi_ar(double umi_ar) {
        this.umi_ar = umi_ar;
    }

    public String getUmi_data() {
        return umi_data;
    }

    public void setUmi_data(String umi_data) {
        this.umi_data = umi_data;
    }

    public String getUmi_hora() {
        return umi_hora;
    }

    public void setUmi_hora(String umi_hora) {
        this.umi_hora = umi_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

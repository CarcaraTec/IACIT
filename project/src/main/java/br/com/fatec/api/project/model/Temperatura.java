package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "temperatura")

public class Temperatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "temp_id")
    private Integer temp_id;

    @Column(name = "temp_ar")
    private  double temp_ar;

    @Column(name = "temp_ponto_orvalho")
    private double temp_ponto_orvalho;

    @Column(name = "temp_max")
    private double temp_max;

    @Column(name = "temp_min")
    private double temp_min;

    @Column(name = "temp_orvalho_max")
    private double temp_orvalho_max;

    @Column(name = "temp_orvalho_min")
    private double temp_orvalho_min;

    @Column(name = "temp_data")
    private String temp_data;

    @Column(name = "temp_hora")
    private String temp_hora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getTemp_id() {
        return temp_id;
    }

    public void setTemp_id(Integer temp_id) {
        this.temp_id = temp_id;
    }

    public double getTemp_ar() {
        return temp_ar;
    }

    public void setTemp_ar(double temp_ar) {
        this.temp_ar = temp_ar;
    }

    public double getTemp_ponto_orvalho() {
        return temp_ponto_orvalho;
    }

    public void setTemp_ponto_orvalho(double temp_ponto_orvalho) {
        this.temp_ponto_orvalho = temp_ponto_orvalho;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_orvalho_max() {
        return temp_orvalho_max;
    }

    public void setTemp_orvalho_max(double temp_orvalho_max) {
        this.temp_orvalho_max = temp_orvalho_max;
    }

    public double getTemp_orvalho_min() {
        return temp_orvalho_min;
    }

    public void setTemp_orvalho_min(double temp_orvalho_min) {
        this.temp_orvalho_min = temp_orvalho_min;
    }

    public String getTemp_data() {
        return temp_data;
    }

    public void setTemp_data(String temp_data) {
        this.temp_data = temp_data;
    }

    public String getTemp_hora() {
        return temp_hora;
    }

    public void setTemp_hora(String temp_hora) {
        this.temp_hora = temp_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

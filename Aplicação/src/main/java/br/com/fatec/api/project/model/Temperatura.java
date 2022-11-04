package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "temperatura")

public class Temperatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "temp_id")
    private Integer tempId;

    @Column(name = "temp_ar")
    private  double tempAr;

    @Column(name = "temp_ponto_orvalho")
    private double tempPontoOrvalho;

    @Column(name = "temp_max")
    private double tempMax;

    @Column(name = "temp_min")
    private double tempMin;

    @Column(name = "temp_orvalho_max")
    private double tempOrvalhoMax;

    @Column(name = "temp_orvalho_min")
    private double tempOrvalhoMin;

    @Column(name = "temp_data")
    private Date tempData;

    @Column(name = "temp_hora")
    private Date tempHora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getTemp_id() {
        return tempId;
    }

    public void setTemp_id(Integer temp_id) {
        this.tempId = temp_id;
    }

    public double getTemp_ar() {
        return tempAr;
    }

    public void setTemp_ar(double temp_ar) {
        this.tempAr = temp_ar;
    }

    public double getTemp_ponto_orvalho() {
        return tempPontoOrvalho;
    }

    public void setTemp_ponto_orvalho(double temp_ponto_orvalho) {
        this.tempPontoOrvalho = temp_ponto_orvalho;
    }

    public double getTemp_max() {
        return tempMax;
    }

    public void setTemp_max(double temp_max) {
        this.tempMax = temp_max;
    }

    public double getTemp_min() {
        return tempMin;
    }

    public void setTemp_min(double temp_min) {
        this.tempMin = temp_min;
    }

    public double getTemp_orvalho_max() {
        return tempOrvalhoMax;
    }

    public void setTemp_orvalho_max(double temp_orvalho_max) {
        this.tempOrvalhoMax = temp_orvalho_max;
    }

    public double getTemp_orvalho_min() {
        return tempOrvalhoMin;
    }

    public void setTemp_orvalho_min(double temp_orvalho_min) {
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

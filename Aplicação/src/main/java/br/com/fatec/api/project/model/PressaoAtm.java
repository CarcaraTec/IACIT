package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pressao_atmosferica")

public class PressaoAtm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pre_atm_id")
    private Integer pressaoId;

    @Column(name = "pre_atm_estacao")
    private double pressaoEstacao;

    @Column(name = "pre_atm_max")
    private double pressaoMax;

    @Column(name = "pre_atm_min")
    private double pressaoMin;

    @Column(name = "pre_data")
    private Date pressaoData;

    @Column(name = "pre_hora")
    private Date pressaoHora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getPressao_id() {
        return pressaoId;
    }

    public void setPressao_id(Integer pressao_id) {
        this.pressaoId = pressao_id;
    }

    public double getPressao_estacao() {
        return pressaoEstacao;
    }

    public void setPressao_estacao(double pressao_estacao) {
        this.pressaoEstacao = pressao_estacao;
    }

    public double getPressao_max() {
        return pressaoMax;
    }

    public void setPressao_max(double pressao_max) {
        this.pressaoMax = pressao_max;
    }

    public double getPressao_min() {
        return pressaoMin;
    }

    public void setPressao_min(double pressao_min) {
        this.pressaoMin = pressao_min;
    }

    public Date getPressao_data() {
        return pressaoData;
    }

    public void setPressao_data(Date pressao_data) {
        this.pressaoData = pressao_data;
    }

    public Date getPressao_hora() {
        return pressaoHora;
    }

    public void setPressao_hora(Date pressao_hora) {
        this.pressaoHora = pressao_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

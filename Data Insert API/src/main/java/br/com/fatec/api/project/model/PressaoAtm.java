package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "pressao_atmosferica")

public class PressaoAtm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pre_atm_id")
    private Integer pressao_id;

    @Column(name = "pre_atm_estacao")
    private double pressao_estacao;

    @Column(name = "pre_atm_max")
    private double pressao_max;

    @Column(name = "pre_atm_min")
    private double pressao_min;

    @Column(name = "pre_data")
    private String pressao_data;

    @Column(name = "pre_hora")
    private String pressao_hora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getPressao_id() {
        return pressao_id;
    }

    public void setPressao_id(Integer pressao_id) {
        this.pressao_id = pressao_id;
    }

    public double getPressao_estacao() {
        return pressao_estacao;
    }

    public void setPressao_estacao(double pressao_estacao) {
        this.pressao_estacao = pressao_estacao;
    }

    public double getPressao_max() {
        return pressao_max;
    }

    public void setPressao_max(double pressao_max) {
        this.pressao_max = pressao_max;
    }

    public double getPressao_min() {
        return pressao_min;
    }

    public void setPressao_min(double pressao_min) {
        this.pressao_min = pressao_min;
    }

    public String getPressao_data() {
        return pressao_data;
    }

    public void setPressao_data(String pressao_data) {
        this.pressao_data = pressao_data;
    }

    public String getPressao_hora() {
        return pressao_hora;
    }

    public void setPressao_hora(String pressao_hora) {
        this.pressao_hora = pressao_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

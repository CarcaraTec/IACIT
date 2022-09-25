package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "radiacao_global")

public class Radiacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rad_id")
    private Integer rad_id;

    @Column(name = "rad_global")
    private double rad_global;

    @Column(name = "rad_data")
    private String rad_data;

    @Column(name = "rad_hora")
    private String rad_hora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getRad_id() {
        return rad_id;
    }

    public void setRad_id(Integer rad_id) {
        this.rad_id = rad_id;
    }

    public double getRad_global() {
        return rad_global;
    }

    public void setRad_global(double rad_global) {
        this.rad_global = rad_global;
    }

    public String getRad_data() {
        return rad_data;
    }

    public void setRad_data(String rad_data) {
        this.rad_data = rad_data;
    }

    public String getRad_hora() {
        return rad_hora;
    }

    public void setRad_hora(String rad_hora) {
        this.rad_hora = rad_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "radiacao_global")

public class Radiacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rad_id")
    private Integer radId;

    @Column(name = "rad_global")
    private double radGlobal;

    @Column(name = "rad_data")
    private Date radData;

    @Column(name = "rad_hora")
    private Date radHora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getRad_id() {
        return radId;
    }

    public void setRad_id(Integer rad_id) {
        this.radId = rad_id;
    }

    public double getRad_global() {
        return radGlobal;
    }

    public void setRad_global(double rad_global) {
        this.radGlobal = rad_global;
    }

    public Date getRad_data() {
        return radData;
    }

    public void setRad_data(Date rad_data) {
        this.radData = rad_data;
    }

    public Date getRad_hora() {
        return radHora;
    }

    public void setRad_hora(Date rad_hora) {
        this.radHora = rad_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

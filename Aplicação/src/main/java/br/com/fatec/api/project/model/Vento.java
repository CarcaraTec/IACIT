package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vento")

public class Vento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ven_id")
    private Integer ventoId;

    @Column(name = "ven_direcao_hor")
    private double ventoDirHoraria;

    @Column(name = "ven_rajada_max")
    private double ventoRajadaMax;

    @Column(name = "ven_velocidade_hor")
    private double ventoVelHoraria;

    @Column(name = "ven_data")
    private Date ventoData;

    @Column(name = "ven_hora")
    private Date ventoHora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getVento_id() {
        return ventoId;
    }

    public void setVento_id(Integer vento_id) {
        this.ventoId = vento_id;
    }

    public double getVento_dir_horaria() {
        return ventoDirHoraria;
    }

    public void setVento_dir_horaria(double vento_dir_horaria) {
        this.ventoDirHoraria = vento_dir_horaria;
    }

    public double getVento_rajada_max() {
        return ventoRajadaMax;
    }

    public void setVento_rajada_max(double vento_rajada_max) {
        this.ventoRajadaMax = vento_rajada_max;
    }

    public double getVento_vel_horaria() {
        return ventoVelHoraria;
    }

    public void setVento_vel_horaria(double vento_vel_horaria) {
        this.ventoVelHoraria = vento_vel_horaria;
    }

    public Date getVento_data() {
        return ventoData;
    }

    public void setVento_data(Date vento_data) {
        this.ventoData = vento_data;
    }

    public Date getVento_hora() {
        return ventoHora;
    }

    public void setVento_hora(Date vento_hora) {
        this.ventoHora = vento_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

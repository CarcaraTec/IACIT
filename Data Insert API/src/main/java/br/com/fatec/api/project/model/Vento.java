package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "vento")

public class Vento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ven_id")
    private Integer vento_id;

    @Column(name = "ven_direcao_hor")
    private double vento_dir_horaria;

    @Column(name = "ven_rajada_max")
    private double vento_rajada_max;

    @Column(name = "ven_velocidade_hor")
    private double vento_vel_horaria;

    @Column(name = "ven_data")
    private String vento_data;

    @Column(name = "ven_hora")
    private String vento_hora;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getVento_id() {
        return vento_id;
    }

    public void setVento_id(Integer vento_id) {
        this.vento_id = vento_id;
    }

    public double getVento_dir_horaria() {
        return vento_dir_horaria;
    }

    public void setVento_dir_horaria(double vento_dir_horaria) {
        this.vento_dir_horaria = vento_dir_horaria;
    }

    public double getVento_rajada_max() {
        return vento_rajada_max;
    }

    public void setVento_rajada_max(double vento_rajada_max) {
        this.vento_rajada_max = vento_rajada_max;
    }

    public double getVento_vel_horaria() {
        return vento_vel_horaria;
    }

    public void setVento_vel_horaria(double vento_vel_horaria) {
        this.vento_vel_horaria = vento_vel_horaria;
    }

    public String getVento_data() {
        return vento_data;
    }

    public void setVento_data(String vento_data) {
        this.vento_data = vento_data;
    }

    public String getVento_hora() {
        return vento_hora;
    }

    public void setVento_hora(String vento_hora) {
        this.vento_hora = vento_hora;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

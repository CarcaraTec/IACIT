package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "vento")

public class Vento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ven_id")
    private Integer ventoId;

    @Column(name = "ven_data")
    private Date ventoData;

    @Column(name = "ven_hora")
    private Date ventoHora;

    @Column(name = "ven_direcao_hor")
    private BigDecimal ventoDirHoraria;

    @Column(name = "ven_rajada_max")
    private BigDecimal ventoRajadaMax;

    @Column(name = "ven_velocidade_hor")
    private BigDecimal ventoVelHoraria;


    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Vento() {
    }

    public Vento(Integer ventoId, Date ventoData, Date ventoHora, BigDecimal ventoDirHoraria,
                 BigDecimal ventoRajadaMax, BigDecimal ventoVelHoraria, String estacao) {
        this.ventoId = ventoId;
        this.ventoData = ventoData;
        this.ventoHora = ventoHora;
        this.ventoDirHoraria = ventoDirHoraria;
        this.ventoRajadaMax = ventoRajadaMax;
        this.ventoVelHoraria = ventoVelHoraria;
        this.estacao = estacao;
    }

    public Integer getVento_id() {
        return ventoId;
    }

    public void setVento_id(Integer vento_id) {
        this.ventoId = vento_id;
    }

    public BigDecimal getVento_dir_horaria() {
        return ventoDirHoraria;
    }

    public void setVento_dir_horaria(BigDecimal vento_dir_horaria) {
        this.ventoDirHoraria = vento_dir_horaria;
    }

    public BigDecimal getVento_rajada_max() {
        return ventoRajadaMax;
    }

    public void setVento_rajada_max(BigDecimal vento_rajada_max) {
        this.ventoRajadaMax = vento_rajada_max;
    }

    public BigDecimal getVento_vel_horaria() {
        return ventoVelHoraria;
    }

    public void setVento_vel_horaria(BigDecimal vento_vel_horaria) {
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

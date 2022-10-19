package br.com.fatec.api.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "precipitacao")

public class Precipitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prec_id")
    private Integer precId;

    @Column(name = "prec_total")
    private double precTotal;

    @Column(name = "prec_hora")
    private Date precHora;

    @Column(name = "prec_data")
    private Date precData;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getPrec_id() {
        return precId;
    }

    public void setPrec_id(Integer prec_id) {
        this.precId = prec_id;
    }

    public double getPrec_total() {
        return precTotal;
    }

    public void setPrec_total(double prec_total) {
        this.precTotal = prec_total;
    }

    public Date getPrec_hora() {
        return precHora;
    }

    public void setPrec_hora(Date prec_hora) {
        this.precHora = prec_hora;
    }

    public Date getPrec_data() {
        return precData;
    }

    public void setPrec_data(Date prec_data) {
        this.precData = prec_data;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

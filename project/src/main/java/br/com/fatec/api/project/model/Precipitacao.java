package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "precipitacao")

public class Precipitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prec_id")
    private Integer prec_id;

    @Column(name = "prec_total")
    private String prec_total;

    @Column(name = "prec_hora")
    private String prec_hora;

    @Column(name = "prec_data")
    private String prec_data;

    @Column(name = "fk_estacao_cod_wmo")
    private String estacao;

    public Integer getPrec_id() {
        return prec_id;
    }

    public void setPrec_id(Integer prec_id) {
        this.prec_id = prec_id;
    }

    public String getPrec_total() {
        return prec_total;
    }

    public void setPrec_total(String prec_total) {
        this.prec_total = prec_total;
    }

    public String getPrec_hora() {
        return prec_hora;
    }

    public void setPrec_hora(String prec_hora) {
        this.prec_hora = prec_hora;
    }

    public String getPrec_data() {
        return prec_data;
    }

    public void setPrec_data(String prec_data) {
        this.prec_data = prec_data;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
}

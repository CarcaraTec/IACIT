package br.com.api.testeProjeto.model;

import javax.persistence.*;

@Entity
@Table(name = "estacao")
public class Estacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estacao")
    private Integer id_estacao;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "altitude")
    private double altitude;

    @Column(name = "data_fundacao")
    private String data_fundacao;

    @Column(name = "unidade_federativa")
    private String unidade_federativa;



    public Integer getId_estacao() {
        return id_estacao;
    }

    public void setId_estacao(Integer id_estacao) {
        this.id_estacao = id_estacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getData_fundacao() {
        return data_fundacao;
    }

    public void setData_fundacao(String data_fundacao) {
        this.data_fundacao = data_fundacao;
    }

    public String getUnidade_federativa() {
        return unidade_federativa;
    }

    public void setUnidade_federativa(String unidade_federativa) {
        this.unidade_federativa = unidade_federativa;
    }
}

package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "estacao")

public class Estacao {

    @Id
    @Column(name = "cod_wmo")
    private String codigo;

    @Column(name = "nome_estacao")
    private String nome_estacao;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "altitude")
    private double altitude;

    @Column(name = "data_fundacao")
    private String data_fundacao;

    @Column(name = "fk_estado_estado_id")
    private String estado;

    public String getNome_estacao() {
        return nome_estacao;
    }

    public void setNome_estacao(String nome_estacao) {
        this.nome_estacao = nome_estacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

package br.com.api.testeProjeto.model;

import javax.persistence.*;

@Entity
@Table(name = "descritivo_dado")
public class Descritivo {

    // atributos da classe Descritivo

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_descritivo")
    private Integer id_descritivo;

    @Column(name = "precipitacao_total")
    private double precipitacao_total;

    @Column(name = "pressao_atmosferica_ao_nivel_da_estacao_horaria")
    private double pressao_atmosferica_ao_nivel_da_estacao_horaria;

    @Column(name = "pressao_atmosferica_max_hora_ant")
    private double pressao_atmosferica_max_hora_ant;

    @Column(name = "pressao_atmosferica_min_hora_ant")
    private double pressao_atmosferica_min_hora_ant;

    @Column(name = "radiacao_global")
    private double radiacao_global;

    @Column(name = "temperatura_ar_bulbo_seco_horaria")
    private double temperatura_ar_bulbo_seco_horaria;

    @Column(name = "temperatura_ponto_orvalho")
    private double temperatura_ponto_orvalho;

    @Column(name = "temperatura_maxima_hora_ant")
    private double temperatura_maxima_hora_ant;

    @Column(name = "temperatura_minima_hora_ant")
    private double temperatura_minima_hora_ant;

    @Column(name = "temperatura_orvalho_max_hora_ant")
    private double temperatura_orvalho_max_hora_ant;

    @Column(name = "temperatura_orvalho_min_hora_ant")
    private double temperatura_orvalho_min_hora_ant;

    @Column(name = "umidade_rel_max_hora_ant")
    private double umidade_rel_max_hora_ant;

    @Column(name = "umidade_rel_min_hora_ant")
    private double umidade_rel_min_hora_ant;

    @Column(name = "umidade_relativa_ar_horaria")
    private double umidade_relativa_ar_horaria;

    @Column(name = "vento_direcao_horaria")
    private double vento_direcao_horaria;

    @Column(name = "vento_rajada_maxima")
    private double vento_rajada_maxima;

    @Column(name = "vento_velocidade_horaria")
    private double vento_velocidade_horaria;

    @Column(name = "data_hora")
    private String data_hora;

    @Column(name = "fk_estacao_id_estacao")
    private String id_estacao;

    //Getters e Setters dos atributos

    public Integer getId_descritivo() {
        return id_descritivo;
    }

    public void setId_descritivo(Integer id_descritivo) {
        this.id_descritivo = id_descritivo;
    }

    public double getPrecipitacao_total() {
        return precipitacao_total;
    }

    public void setPrecipitacao_total(double precipitacao_total) {
        this.precipitacao_total = precipitacao_total;
    }

    public double getPressao_atmosferica_ao_nivel_da_estacao_horaria() {
        return pressao_atmosferica_ao_nivel_da_estacao_horaria;
    }

    public void setPressao_atmosferica_ao_nivel_da_estacao_horaria(double pressao_atmosferica_ao_nivel_da_estacao_horaria) {
        this.pressao_atmosferica_ao_nivel_da_estacao_horaria = pressao_atmosferica_ao_nivel_da_estacao_horaria;
    }

    public double getPressao_atmosferica_max_hora_ant() {
        return pressao_atmosferica_max_hora_ant;
    }

    public void setPressao_atmosferica_max_hora_ant(double pressao_atmosferica_max_hora_ant) {
        this.pressao_atmosferica_max_hora_ant = pressao_atmosferica_max_hora_ant;
    }

    public double getPressao_atmosferica_min_hora_ant() {
        return pressao_atmosferica_min_hora_ant;
    }

    public void setPressao_atmosferica_min_hora_ant(double pressao_atmosferica_min_hora_ant) {
        this.pressao_atmosferica_min_hora_ant = pressao_atmosferica_min_hora_ant;
    }

    public double getRadiacao_global() {
        return radiacao_global;
    }

    public void setRadiacao_global(double radiacao_global) {
        this.radiacao_global = radiacao_global;
    }

    public double getTemperatura_ar_bulbo_seco_horaria() {
        return temperatura_ar_bulbo_seco_horaria;
    }

    public void setTemperatura_ar_bulbo_seco_horaria(double temperatura_ar_bulbo_seco_horaria) {
        this.temperatura_ar_bulbo_seco_horaria = temperatura_ar_bulbo_seco_horaria;
    }

    public double getTemperatura_ponto_orvalho() {
        return temperatura_ponto_orvalho;
    }

    public void setTemperatura_ponto_orvalho(double temperatura_ponto_orvalho) {
        this.temperatura_ponto_orvalho = temperatura_ponto_orvalho;
    }

    public double getTemperatura_maxima_hora_ant() {
        return temperatura_maxima_hora_ant;
    }

    public void setTemperatura_maxima_hora_ant(double temperatura_maxima_hora_ant) {
        this.temperatura_maxima_hora_ant = temperatura_maxima_hora_ant;
    }

    public double getTemperatura_minima_hora_ant() {
        return temperatura_minima_hora_ant;
    }

    public void setTemperatura_minima_hora_ant(double temperatura_minima_hora_ant) {
        this.temperatura_minima_hora_ant = temperatura_minima_hora_ant;
    }

    public double getTemperatura_orvalho_max_hora_ant() {
        return temperatura_orvalho_max_hora_ant;
    }

    public void setTemperatura_orvalho_max_hora_ant(double temperatura_orvalho_max_hora_ant) {
        this.temperatura_orvalho_max_hora_ant = temperatura_orvalho_max_hora_ant;
    }

    public double getTemperatura_orvalho_min_hora_ant() {
        return temperatura_orvalho_min_hora_ant;
    }

    public void setTemperatura_orvalho_min_hora_ant(double temperatura_orvalho_min_hora_ant) {
        this.temperatura_orvalho_min_hora_ant = temperatura_orvalho_min_hora_ant;
    }

    public double getUmidade_rel_max_hora_ant() {
        return umidade_rel_max_hora_ant;
    }

    public void setUmidade_rel_max_hora_ant(double umidade_rel_max_hora_ant) {
        this.umidade_rel_max_hora_ant = umidade_rel_max_hora_ant;
    }

    public double getUmidade_rel_min_hora_ant() {
        return umidade_rel_min_hora_ant;
    }

    public void setUmidade_rel_min_hora_ant(double umidade_rel_min_hora_ant) {
        this.umidade_rel_min_hora_ant = umidade_rel_min_hora_ant;
    }

    public double getUmidade_relativa_ar_horaria() {
        return umidade_relativa_ar_horaria;
    }

    public void setUmidade_relativa_ar_horaria(double umidade_relativa_ar_horaria) {
        this.umidade_relativa_ar_horaria = umidade_relativa_ar_horaria;
    }

    public double getVento_direcao_horaria() {
        return vento_direcao_horaria;
    }

    public void setVento_direcao_horaria(double vento_direcao_horaria) {
        this.vento_direcao_horaria = vento_direcao_horaria;
    }

    public double getVento_rajada_maxima() {
        return vento_rajada_maxima;
    }

    public void setVento_rajada_maxima(double vento_rajada_maxima) {
        this.vento_rajada_maxima = vento_rajada_maxima;
    }

    public double getVento_velocidade_horaria() {
        return vento_velocidade_horaria;
    }

    public void setVento_velocidade_horaria(double vento_velocidade_horaria) {
        this.vento_velocidade_horaria = vento_velocidade_horaria;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getId_estacao() {
        return id_estacao;
    }

    public void setId_estacao(String id_estacao) {
        this.id_estacao = id_estacao;
    }
}

package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "regiao")

public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regiao_id")
    private Integer regiao_id;

    @Column(name = "nome_regiao", nullable = true)
    private String nome_regiao;

    public Integer getRegiao_id() {
        return regiao_id;
    }

    public void setRegiao_id(Integer regiao_id) {
        this.regiao_id = regiao_id;
    }

    public String getNome_regiao() {
        return nome_regiao;
    }

    public void setNome_regiao(String nome_regiao) {
        this.nome_regiao = nome_regiao;
    }
}
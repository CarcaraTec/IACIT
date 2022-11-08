package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "regiao")

public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regiao_id")
    private Integer regiaoId;

    @Column(name = "nome_regiao", nullable = true)
    private String nomeRegiao;

    public Integer getRegiao_id() {
        return regiaoId;
    }

    public void setRegiao_id(Integer regiao_id) {
        this.regiaoId = regiao_id;
    }

    public String getNome_regiao() {
        return nomeRegiao;
    }

    public void setNome_regiao(String nome_regiao) {
        this.nomeRegiao = nome_regiao;
    }
}
package br.com.api.testeProjeto.model;

import javax.persistence.*;

@Entity
@Table(name = "regiao")
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_regiao")
    private Integer id_regiao;

    @Column(name = "nome_regiao", nullable = true)
    private String nome_regiao;

    public Integer getId_regiao() {
        return id_regiao;
    }

    public void setId_regiao(Integer id_regiao) {
        this.id_regiao = id_regiao;
    }

    public String getNome_regiao() {
        return nome_regiao;
    }

    public void setNome_regiao(String nome_regiao) {
        this.nome_regiao = nome_regiao;
    }
}

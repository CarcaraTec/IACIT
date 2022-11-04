package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "estado")

public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_id")
    private Integer estadoId;

    @Column(name = "nome_estado")
    private String nomeEstado;

    @Column(name = "fk_regiao_nome_regiao")
    private String regiao;

    public Integer getEstado_id() {
        return estadoId;
    }

    public void setEstado_id(Integer estado_id) {
        this.estadoId = estado_id;
    }

    public String getNome_estado() {
        return nomeEstado;
    }

    public void setNome_estado(String nome_estado) {
        this.nomeEstado = nome_estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}

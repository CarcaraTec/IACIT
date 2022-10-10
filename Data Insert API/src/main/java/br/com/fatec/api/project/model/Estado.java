package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "estado")

public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_id")
    private Integer estado_id;

    @Column(name = "nome_estado")
    private String nome_estado;

    @Column(name = "fk_regiao_id_regiao")
    private String regiao;

    public Integer getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Integer estado_id) {
        this.estado_id = estado_id;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}

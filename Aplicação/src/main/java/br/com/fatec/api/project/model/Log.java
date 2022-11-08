package br.com.fatec.api.project.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario_log")

public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "email", length = 100, nullable = true)
    private String email;

    @Column(name = "ip", columnDefinition = "TEXT", nullable = true)
    private String ip;

    @Column(name = "status", columnDefinition = "TEXT", nullable = true)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

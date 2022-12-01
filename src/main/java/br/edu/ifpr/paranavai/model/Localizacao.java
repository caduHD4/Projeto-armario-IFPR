package br.edu.ifpr.paranavai.model;

import javax.persistence.*;

@Entity
@Table(name = "localizacao")
public class Localizacao{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name="nome", nullable = false)
    private String nome;
    
    @Column(name="ativo", nullable = false)
    private boolean ativo;

    public Localizacao() {
    }

    public Localizacao(String nome, boolean ativo) {
        this.ativo = ativo;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String id) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

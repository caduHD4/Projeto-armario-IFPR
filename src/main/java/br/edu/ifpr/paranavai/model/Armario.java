package br.edu.ifpr.paranavai.model;

import javax.persistence.*;

@Entity
@Table(name = "armario")
public class Armario{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name="numero")
    private Long numero;
    
    @Column(name="ativo")
    private boolean ativo;
    
    @Column(name="observacao")
    private String observacao;

    public Armario() {
    }

    public Armario(Long numero, boolean ativo, String observacao) {
        this.numero = numero;
        this.ativo = ativo;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getObservacoes() {
        return observacao;
    }

    public void setObservacoes(String observacoes) {
        this.observacao = observacoes;
    }
    
}

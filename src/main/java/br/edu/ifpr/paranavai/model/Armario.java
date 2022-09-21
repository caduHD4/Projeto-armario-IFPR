package br.edu.ifpr.paranavai.armarios.model;

import javax.persistence.*;

@Entity
@Table(name = "armario")
public class Armario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "armario_id", unique = true, nullable = false)
    private Long id;
    
    @Column(name="numero")
    private String numero;
    
    @Column(name="ativo")
    private boolean ativo;
    
    @Column(name="observacoes")
    private String observacoes;

    public Armario() {
    }

    public Armario(String numero, boolean ativo, String observacoes) {
        this.numero = numero;
        this.ativo = ativo;
        this.observacoes = observacoes;
    }
}

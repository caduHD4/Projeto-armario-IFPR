package br.edu.ifpr.paranavai.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bibliotecario")
public class Bibliotecario extends Pessoa{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bibliotecario_id", unique = true, nullable = false)
    private Long id;
    
    @Column(name="siape")
    private String siape;

    public Bibliotecario() {
    }

    public Bibliotecario(String siape, String nome, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}
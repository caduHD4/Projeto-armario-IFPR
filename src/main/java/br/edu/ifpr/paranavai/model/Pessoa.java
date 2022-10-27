package br.edu.ifpr.paranavai.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

public abstract class Pessoa implements Serializable{
    private String nome;
    
    private String email;
    
    private String telefone;
    
    private String senha;
    
    private boolean ativo;
    
    private Date dataAtualizacao;
    
    private Date dataCriacao;
}

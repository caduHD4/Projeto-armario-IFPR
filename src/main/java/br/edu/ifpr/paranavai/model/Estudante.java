package br.edu.ifpr.paranavai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudante")
public class Estudante extends Pessoa{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "estudante_id", unique = true, nullable = false)
    private Long id;
    
    @Column(name="ra")
    private String ra;
}

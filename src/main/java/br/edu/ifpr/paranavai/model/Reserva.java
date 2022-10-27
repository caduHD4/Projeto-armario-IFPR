package br.edu.ifpr.paranavai.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "estudante_id")
    private Estudante estudante;
    
    @ManyToOne
    @JoinColumn(name = "armario_id")
    private Armario armario;
    
    @Column(name = "data_hora_devolucao")
    private Date dataHoraDevolucao;
    
    @Column(name = "data_hora_emprestimo")
    private Date dataHoraEmprestimo;

    public Reserva() {
    }

    public Reserva(Pessoa pessoa, Armario armario, Date dataHoraDevolucao, Date dataHoraEmprestimo) {
        this.estudante = estudante;
        this.armario = armario;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }
}

package br.edu.ifpr.paranavai.model;
import java.util.Date;
public class Reserva {
    private Pessoa pessoa;
    private Armario armario;
    private Date dataHoraDevolucao;
    private Date dataHoraEmprestimo;

    public Reserva() {
    }

    public Reserva(Pessoa pessoa, Armario armario, Date dataHoraDevolucao, Date dataHoraEmprestimo) {
        this.pessoa = pessoa;
        this.armario = armario;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }
}

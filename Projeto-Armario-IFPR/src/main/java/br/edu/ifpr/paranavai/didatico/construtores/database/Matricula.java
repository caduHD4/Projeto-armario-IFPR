package br.edu.ifpr.paranavai.didatico.construtores.database;


public class Matricula {
	// atributos
	int ra;
	String data;
	Curso curso;
	Estudante estudante;

	public Matricula() {
		super();
	}

	public Matricula(int ra, String data, Curso curso, Estudante estudante) {
		super();
		this.ra = ra;
		this.data = data;
		this.curso = curso;
		this.estudante = estudante;
	}

}

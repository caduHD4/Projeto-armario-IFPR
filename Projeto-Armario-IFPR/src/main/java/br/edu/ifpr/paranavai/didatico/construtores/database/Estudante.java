package br.edu.ifpr.paranavai.didatico.construtores.database;

import java.util.Scanner;

public class Estudante {
	// atributos
	private String nome;
	private String cpf;
	private String sobrenome;

	// m�todos
	// Construtores tem o mesmo nome da classe e n�o tem retorno
	public Estudante() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do estudante");
		nome = teclado.nextLine();
	}

	public Estudante(String nome) {
		// apontar para o atributo com o prefixo 'this.'
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}
}

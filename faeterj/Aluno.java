package br.edu.faeterj;

public class Aluno {
	private String nome;
	private String endereco;
	private int matricula;
	private String email;
	private int idade;
	
	public Aluno(String nome, String email, String endereco, int idade, int matricula) {
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.idade = idade;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public String getEmail() {
		return this.email;
	}
	public int getIdade() {
		return this.idade;
	}
	public int getMatricula() {
		return this.matricula;
	}
}

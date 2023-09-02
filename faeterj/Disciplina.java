package br.edu.faeterj;

public class Disciplina {
	private int id;
	private String nome;
	private String sigla;
	private int periodo;
	
	public Disciplina (String nome, String sigla, int periodo) {
		this.nome = nome;
		this.sigla = sigla;
		this.periodo = periodo;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public int getPeriodo() {
		return periodo;
	}
	public int getId() {
		return id;
	}
}

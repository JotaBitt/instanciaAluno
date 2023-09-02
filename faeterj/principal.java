package br.edu.faeterj;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		String nome, sigla, endereco, email;
		int periodo, idade, matricula;
		
		Scanner sc = new Scanner(System.in) 
			System.out.printf("Coloque o nome da disciplina: ");
			nome = sc.nextLine();
			
			System.out.printf("Coloque a sigla da disciplina: ");
			sigla = sc.nextLine();
			
			System.out.printf("Coloque o período da disciplina: ");
			periodo = sc.nextInt();
			
			Disciplina disciplina = new Disciplina(nome, sigla, periodo);
			
			System.out.println("Disciplina: " + disciplina.getNome()+" "+ disciplina.getSigla() +" "+ disciplina.getPeriodo());
			
			System.out.printf("\nDigite o nome do aluno: ");
			nome = sc.next();
			
			System.out.printf("Digite o endereço do aluno: ");
			endereco = sc.next();
			
			System.out.printf("Digite o email do aluno: ");
			email = sc.next();
			
			System.out.printf("Digite a matrícula do aluno: ");
			matricula = sc.nextInt();
			
			System.out.printf("Coloque a idade do aluno: ");
			idade = sc.nextInt();
			
		Aluno aluno = new Aluno(nome, email, endereco, idade, matricula);
		System.out.printf("\nAluno: " + aluno.getNome()+ "\nEmail: "+ aluno.getEmail()+ "\nEndereço: "+ aluno.getEndereco());
		System.out.printf("\nIdade: "+ aluno.getIdade()+ "\nMatrícula: "+ aluno.getMatricula());
		
		
	}

}

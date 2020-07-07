package com.loiane.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		// estamos transformando uma classe menor em um tipo maior na hierarquia
		Pessoa pessoaAluno = aluno; // upcasting

		Pessoa aluno2 = (Pessoa) new Aluno();

		Pessoa aluno3 = new Pessoa();
		// Exception in thread "main" java.lang.ClassCastException:
		Aluno aluno4 = (Aluno) aluno3; // downcasting
	}

}
